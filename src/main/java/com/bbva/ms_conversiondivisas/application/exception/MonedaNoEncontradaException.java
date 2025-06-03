package com.bbva.ms_conversiondivisas.application.exception;

public class MonedaNoEncontradaException extends RuntimeException {
    private final String moneda;

    public MonedaNoEncontradaException(String moneda) {
     super("La moneda '" + moneda + "' no se encuentra disponible.");
        this.moneda = moneda;
    }

    public String getMoneda() {
        return moneda;
    }

}
