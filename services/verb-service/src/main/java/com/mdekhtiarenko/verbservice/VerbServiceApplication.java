package com.mdekhtiarenko.verbservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class VerbServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(VerbServiceApplication.class, args);
    }

}
