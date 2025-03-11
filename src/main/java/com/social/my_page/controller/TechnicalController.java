package com.social.my_page.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TechnicalController {

    @Value("${spring.application.name}")
    private String appVersion;

    @GetMapping("/version")
    public String getVersion() {
        return "{\"version\": \"" + appVersion + "\"}";
    }
}
