package com.bbva.ms_conversiondivisas.application.service;

import com.bbva.ms_conversiondivisas.application.exception.CurrencyNotFoundException;
import com.bbva.ms_conversiondivisas.application.exception.ExchangeRateApiException;
import com.bbva.ms_conversiondivisas.domain.dto.ConversionRequestDTO;
import com.bbva.ms_conversiondivisas.domain.dto.ConversionResponseDTO;


public interface ConversionDivisasInterface {
    ConversionResponseDTO conversionMonedaDestino(ConversionRequestDTO conversionRequest) 
        throws ExchangeRateApiException, CurrencyNotFoundException, IllegalArgumentException;
}



