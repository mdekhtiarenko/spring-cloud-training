package com.mdekhtiarenko.adjectiveservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class AdjectiveServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdjectiveServiceApplication.class, args);
	}

}
