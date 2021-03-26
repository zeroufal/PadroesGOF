package br.com.dio.estudospringboot.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${app.message}")
    private String appMessage;

    @GetMapping("/app")
    public String getAppMessage() {
        return appMessage;
    }

    @GetMapping("/")
    public String helloMessage() {
        return "Hello";
    }
}
