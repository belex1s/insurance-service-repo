package com.yoda.insurance.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Insurance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String description;

    // Constructors
    public Insurance() {
    }

    public Insurance(String type, String description) {
        this.type = type;
        this.description = description;
    }

    // Getters and Setters
    // ...
}
