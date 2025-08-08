package com.example.demo.controller;

import com.example.demo.data.Droid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/droid")
public class DroidController {

    private Droid droid;

    public DroidController(Droid droid) {
        this.droid = droid;
    }

    @GetMapping
    public Droid getDroid() {
        return droid;
    }
}
