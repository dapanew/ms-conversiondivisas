package com.bbva.ms_conversiondivisas.application.exception;
/**
 * Excepción personalizada para errores relacionados con la API de tasas de cambio.
 * Esta excepción se lanza cuando hay un problema al obtener o procesar las tasas de cambio.
 */
public class ExchangeRateApiException extends RuntimeException {
    public ExchangeRateApiException(String message) {
        super(message);
    }

}