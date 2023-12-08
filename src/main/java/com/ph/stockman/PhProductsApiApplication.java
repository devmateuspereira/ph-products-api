package com.ph.stockman;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
public class PhProductsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PhProductsApiApplication.class, args);
	}

}
