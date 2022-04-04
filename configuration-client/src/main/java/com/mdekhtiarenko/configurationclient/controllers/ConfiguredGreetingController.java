package com.mdekhtiarenko.configurationclient.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfiguredGreetingController {

    @Value("${greeting}")
    private String greeting;

    @GetMapping("/greeting")
    public String showGreeting() {
        return greeting;
    }
}
