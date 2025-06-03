package com.bbva.ms_conversiondivisas.application.exception;

    public class CurrencyNotFoundException extends RuntimeException {
    public CurrencyNotFoundException(String currencyCode) {
        super("Currency not found: " + currencyCode);
    }
}