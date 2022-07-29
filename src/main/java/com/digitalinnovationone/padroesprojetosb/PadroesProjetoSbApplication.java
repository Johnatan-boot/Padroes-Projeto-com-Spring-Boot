package com.digitalinnovationone.padroesprojetosb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class PadroesProjetoSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(PadroesProjetoSbApplication.class, args);
	}

}
