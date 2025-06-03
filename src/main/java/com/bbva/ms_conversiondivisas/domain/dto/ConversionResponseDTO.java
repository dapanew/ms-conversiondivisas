package com.bbva.ms_conversiondivisas.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;

//import com.fasterxml.jackson.annotation.JsonFormat;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConversionResponseDTO {
     //@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")

    private LocalDate fechaConversion;
    private BigDecimal tasaConversion;
    private BigDecimal montoOriginal;
    private BigDecimal montoConvertido;




}
