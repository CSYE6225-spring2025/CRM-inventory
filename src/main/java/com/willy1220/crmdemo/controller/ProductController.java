package com.willy1220.crmdemo.controller;

import com.willy1220.crmdemo.model.Product;
import com.willy1220.crmdemo.service.Product.ProductServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/product")
public class ProductController {
    private final ProductServiceImpl service;

    public ProductController(ProductServiceImpl service) {
        this.service = service;
    }

    @GetMapping
    public List<Product> getProducts() {
        return service.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable UUID id) {

        return service.getProductById(id);
    }

    @PostMapping("/post")
    public void addProduct(@RequestBody Product product) {
        service.addProduct(product);
    }

    @DeleteMapping("/{id}")
    public void deleteProduct(@PathVariable UUID id) {
        service.deleteProductById(id);
    }

    @GetMapping("/findby/{brandName}")
    public List<Product> findProductsByBrand(@PathVariable String brandName){
        return service.findProductsByBrandName(brandName);
    }



}
