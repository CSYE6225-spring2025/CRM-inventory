package com.willy1220.crmdemo.service.Product;

import com.willy1220.crmdemo.model.Product;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

public interface ProductService {

    public List<Product> getAllProducts();

    public Product getProductById(UUID id);

    public void deleteProductById(UUID id);

    public void addProduct(Product product);

    // update product info
    public void updateProductCost(UUID id, BigDecimal cost);

    public void updateProductBrand(UUID id,  int brandId);

    // Search product by conditions
    public List<Product> findProductsByBrandName(String brandName);
    public List<Product> findProductsByCarType(int carTypeId);

    public List<Product> searchProductsByKeyword(String keyword);
}
