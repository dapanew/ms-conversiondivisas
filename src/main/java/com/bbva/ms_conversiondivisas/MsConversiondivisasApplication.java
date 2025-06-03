package com.bbva.ms_conversiondivisas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MsConversiondivisasApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsConversiondivisasApplication.class, args);
	}

}
