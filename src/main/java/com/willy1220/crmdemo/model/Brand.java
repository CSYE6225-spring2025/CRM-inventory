package com.willy1220.crmdemo.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(unique = true, nullable = false)
    private String name;




    public Brand(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public Brand() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "brand{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }



}
