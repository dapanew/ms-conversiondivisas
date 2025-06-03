package com.bbva.ms_conversiondivisas.application.service;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.bbva.ms_conversiondivisas.application.exception.CurrencyNotFoundException;
import com.bbva.ms_conversiondivisas.application.exception.ExchangeRateApiException;
import com.bbva.ms_conversiondivisas.domain.dto.ConversionRequestDTO;
import com.bbva.ms_conversiondivisas.domain.dto.ConversionResponseDTO;
import com.bbva.ms_conversiondivisas.domain.dto.ExchangeRateApiResponseDTO;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;

@Service
@RequiredArgsConstructor
public class ConversionDivisasServiceImpl implements ConversionDivisasInterface {

private final ExchangeRateClient exchangeRateClient;
   @Value("${exchange.rate.api.key}")
    private String apiKey;
 public ConversionResponseDTO conversionMonedaDestino(ConversionRequestDTO conversionRequest) {
     ExchangeRateApiResponseDTO apiResponse = exchangeRateClient.getLatestRates(apiKey, null);

        // Validar respuesta de la API
        if (apiResponse == null || !apiResponse.isSuccess()) {
            String errorMessage = apiResponse != null && apiResponse.getError() != null ? 
                    apiResponse.getError().getMessage() : "Unknown error from Exchange Rate API";
            throw new ExchangeRateApiException("Error fetching exchange rates: " + errorMessage);
        }
        // Verificar que las monedas existan
        validateCurrency(apiResponse, conversionRequest.getMonedaOrigen());
        validateCurrency(apiResponse, conversionRequest.getMonedaDestino());
        BigDecimal sourceRate = apiResponse.getRates().get(conversionRequest.getMonedaOrigen());
        BigDecimal targetRate = apiResponse.getRates().get(conversionRequest.getMonedaDestino());
        if ("EUR".equalsIgnoreCase(conversionRequest.getMonedaOrigen())) {
            sourceRate = BigDecimal.ONE;
        }
        if ("EUR".equalsIgnoreCase(conversionRequest.getMonedaDestino())) {
            targetRate = BigDecimal.ONE;
        }
         // Calcular tasa de conversión
        BigDecimal conversionRate = targetRate.divide(sourceRate, 6, RoundingMode.HALF_UP);
        
     // Calcular monto convertido
        BigDecimal convertedAmount = conversionRequest.getMonto().multiply(conversionRate)
                .setScale(2, RoundingMode.HALF_UP);
        if (conversionRequest.getMonedaOrigen() == null || conversionRequest.getMonedaDestino() == null) {
            throw new IllegalArgumentException("Moneda de origen y destino son requeridas");
        }    
        ConversionResponseDTO response = new ConversionResponseDTO();
        response.setFechaConversion(LocalDateTime.now());
        response.setTasaConversion(conversionRate);
        response.setMontoOriginal(conversionRequest.getMonto());
        response.setMontoConvertido(convertedAmount);
          return response;
    }
    private void validateCurrency(ExchangeRateApiResponseDTO apiResponse, String currencyCode) {
        if (!"EUR".equalsIgnoreCase(currencyCode) && 
            !apiResponse.getRates().containsKey(currencyCode)) {
            throw new CurrencyNotFoundException(currencyCode);
        }
    }

}
