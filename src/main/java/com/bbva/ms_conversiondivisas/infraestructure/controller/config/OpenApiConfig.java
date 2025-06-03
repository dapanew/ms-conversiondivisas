package com.bbva.ms_conversiondivisas.infraestructure.controller.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI currencyConverterOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Conversion de Divisa API")
                        .description("Microservicio para conversión de divisas")
                        .version("v1.0")
                        .contact(new Contact()
                                .name("bbva")
                                .email("soporte@bbva.com")
                                .url("https://www.bbva.com/soporte"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0")));
    }
}