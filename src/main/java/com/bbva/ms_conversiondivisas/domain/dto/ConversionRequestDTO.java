package com.bbva.ms_conversiondivisas.domain.dto;

import java.math.BigDecimal;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConversionRequestDTO {

@NotNull(message = "El monto es requerido")
@DecimalMin(value = "0.01", message = "El monto debe ser mayor a 0")
private BigDecimal monto;

@NotNull(message = "La moneda origen es requerida y debe ser un código ISO 4217 válido ejemplo: USD, EUR")
@Pattern(regexp = "^[A-Z]{3}$", message = "La moneda origen debe ser un código ISO 4217 válido (3 letras mayúsculas ejemplo: USD, EUR)")
private String monedaOrigen;

@NotNull(message = "La moneda destino es requerida y debe ser un código ISO 4217 válido ejemplo: USD, EUR")
@Pattern(regexp = "^[A-Z]{3}$", message = "La moneda destino debe ser un código ISO 4217 válido (3 letras mayúsculas ejemplo: USD, EUR)")
private String monedaDestino;

}
