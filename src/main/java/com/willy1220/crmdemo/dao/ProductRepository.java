package com.willy1220.crmdemo.dao;

import com.willy1220.crmdemo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, UUID> {
    List<Product> findProductsByBrandId(int brandId);

    List<Product> findByNameContaining(String words);
}
