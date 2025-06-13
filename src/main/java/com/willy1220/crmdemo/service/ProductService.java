package com.willy1220.crmdemo.service;

import com.willy1220.crmdemo.dao.ProductRepository;
import com.willy1220.crmdemo.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> getProducts() {
        return repository.findAll();

    }
}
