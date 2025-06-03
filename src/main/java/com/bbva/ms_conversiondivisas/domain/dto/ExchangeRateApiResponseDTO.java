package com.bbva.ms_conversiondivisas.domain.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Map;

@Data
public class ExchangeRateApiResponseDTO {
    private boolean success;
    private LocalDate date;
    private String base;
    private Map<String, BigDecimal> rates;
    private Error error;
    
    @Data
    public static class Error {
        private String code;
        private String message;
    }
}