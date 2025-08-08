package com.example.demo.data;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Coffee {

    @Id
    private String id;
    private String name;

    public Coffee(String name) {
        this(UUID.randomUUID().toString(), name);
    }
}
