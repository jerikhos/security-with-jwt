package com.jerikho.securitywithjwt.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/")
    public String helloWorld(HttpServletRequest request) {
        return "Hello World!, the SESSION_ID is " + request.getSession().getId();
    }
}
