package com.bbva.ms_conversiondivisas.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConversionResponseDTO {

    private LocalDateTime fechaConversion;
    private BigDecimal tasaConversion;
    private BigDecimal montoOriginal;
    private BigDecimal montoConvertido;
}
