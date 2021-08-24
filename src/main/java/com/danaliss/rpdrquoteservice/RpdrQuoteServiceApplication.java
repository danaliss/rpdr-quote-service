package com.danaliss.rpdrquoteservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RpdrQuoteServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RpdrQuoteServiceApplication.class, args);
	}

}
