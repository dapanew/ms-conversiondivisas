package com.bbva.ms_conversiondivisas.application.exception;

import java.time.LocalDateTime;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
public class GlobalExceptionHandler {

        @ExceptionHandler(MonedaNoEncontradaException.class)
    public ResponseEntity<ErrorResponse> handleCurrencyNotFound(MonedaNoEncontradaException ex) {
        ErrorResponse error = new ErrorResponse(
            "CURRENCY_NOT_FOUND",
            "La moneda '" + ex.getMoneda() + "' no se encuentra disponible.",
            LocalDateTime.now()
        );
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(error);
    }
      @ExceptionHandler(CurrencyNotFoundException.class)
    public ResponseEntity<String> handleCurrencyNotFoundException(CurrencyNotFoundException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }
    @ExceptionHandler(ExchangeRateApiException.class)
    public ResponseEntity<String> handleExchangeRateApiException(ExchangeRateApiException ex) {
        return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(ex.getMessage());
    }
    public static class ErrorResponse {
        private String code;
        private String message;
        private LocalDateTime timestamp;
        private Map<String, String> details;
        
        public ErrorResponse(String code, String message, LocalDateTime timestamp) {
            this.code = code;
            this.message = message;
            this.timestamp = timestamp;
        }
        
        public ErrorResponse(String code, String message, LocalDateTime timestamp, Map<String, String> details) {
            this.code = code;
            this.message = message;
            this.timestamp = timestamp;
            this.details = details;
        }
        
        // Getters and Setters
        public String getCode() { return code; }
        public void setCode(String code) { this.code = code; }
        
        public String getMessage() { return message; }
        public void setMessage(String message) { this.message = message; }
        
        public LocalDateTime getTimestamp() { return timestamp; }
        public void setTimestamp(LocalDateTime timestamp) { this.timestamp = timestamp; }
        
        public Map<String, String> getDetails() { return details; }
        public void setDetails(Map<String, String> details) { this.details = details; }
    }
    
    
}
