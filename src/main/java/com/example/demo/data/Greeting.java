package com.example.demo.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@AllArgsConstructor
@ConfigurationProperties(prefix = "greeting")
public class Greeting {
    
    private String name;
    private String coffee;

}
