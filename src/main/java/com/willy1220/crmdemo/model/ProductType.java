package com.willy1220.crmdemo.model;

import jakarta.persistence.*;

@Entity
public class ProductType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "product")
    private String name;

    public ProductType(String name) {
        this.name = name;
    }

    public ProductType() {

    }
}
