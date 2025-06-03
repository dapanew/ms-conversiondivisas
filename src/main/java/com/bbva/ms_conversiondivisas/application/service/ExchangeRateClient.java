package com.bbva.ms_conversiondivisas.application.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bbva.ms_conversiondivisas.domain.dto.ExchangeRateApiResponseDTO;

@FeignClient(name = "exchangeRateClient", url = "${exchange.rate.api.url}")
public interface ExchangeRateClient {
    
    @GetMapping("/latest")
    ExchangeRateApiResponseDTO getLatestRates(
            @RequestParam("access_key") String accessKey,
            @RequestParam(value = "symbols", required = false) String symbols);
}