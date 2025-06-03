package com.bbva.ms_conversiondivisas.infraestructure.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bbva.ms_conversiondivisas.application.service.ConversionDivisasServiceImpl;
import com.bbva.ms_conversiondivisas.domain.dto.ConversionRequestDTO;
import com.bbva.ms_conversiondivisas.domain.dto.ConversionResponseDTO;

import jakarta.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import static net.logstash.logback.argument.StructuredArguments.value;

@RestController
@RequestMapping("/api/v1/conversion-divisas")
public class ConversionDivisasController {
private static final Logger log = LoggerFactory.getLogger(ConversionDivisasController.class);
private final ConversionDivisasServiceImpl conversionDivisasService;

public ConversionDivisasController(ConversionDivisasServiceImpl conversionDivisasService) {
    this.conversionDivisasService = conversionDivisasService;
}
@PostMapping
public ResponseEntity<ConversionResponseDTO>  convertirDivisa(@Valid @RequestBody ConversionRequestDTO conversionRequest) {
        log.info(null, value("patch", "/api/v1/conversion-divisas"),value("msj","inicio conversion de divisas valores enviados "+conversionRequest));
   
           ConversionResponseDTO responseConversion = conversionDivisasService.conversionMonedaDestino(conversionRequest);
    log.info(null, value("patch", "/api/v1/conversion-divisas"),value("msj","fin conversion de divisas resultado "+responseConversion));
      return ResponseEntity.ok(responseConversion);
    
}

}


