package com.example.demo.controller;

import com.example.demo.data.Greeting;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private Greeting greeting;

    public GreetingController(Greeting greeting) {
        this.greeting = greeting;
    }

    @GetMapping
    public String getGreeting() {
        return greeting.getName();
    }

    @GetMapping("/coffee")
    public String getCoffee() {
        return greeting.getCoffee();
    }
}
