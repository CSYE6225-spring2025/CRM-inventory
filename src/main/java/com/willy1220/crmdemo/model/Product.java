package com.willy1220.crmdemo.model;

import jakarta.persistence.*;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "Product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID) // using .save() to generate UUID
    @Column(name="Product_Id")
    private UUID id;

    @Column(name="Produce_Name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;


    @Column(name="Cost")
    private BigDecimal cost;

    @Column(name = "Vehicle_Tpye")
    @NotNull
    private String vehicleTpye;

    public Product(UUID id, String name, Brand brand, BigDecimal cost, String vehicleTpye) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.cost = cost;
        this.vehicleTpye = vehicleTpye;
    }

    public Product() {

    }


    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public void setCost(int cost) {
        this.cost = BigDecimal.valueOf(cost);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getVehicleTpye() {
        return vehicleTpye;
    }

    public void setVehicleTpye(String vehicleTpye) {
        this.vehicleTpye = vehicleTpye;
    }


    @Override
    public String toString() {
        return "product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", brand=" + brand +
                ", cost=" + cost +
                '}';
    }
}
