package com.ankit.journalapp.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/HealthCheck")
public class HealthCheck {
    @GetMapping("/ok")
    public String healthCheck(){
        return "Ok";
    }
}
