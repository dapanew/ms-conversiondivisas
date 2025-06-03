package com.bbva.ms_conversiondivisas.infraestructure.controller.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(basePackages = "com.bbva.ms_conversiondivisas.infraestructure.service")
public class FeignConfig {
}