package com.willy1220.crmdemo.service.Product;

import com.willy1220.crmdemo.dao.ProductRepository;
import com.willy1220.crmdemo.model.Brand;
import com.willy1220.crmdemo.model.Product;
import com.willy1220.crmdemo.service.brand.BrandService;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;
    private final BrandService brandService;

    public ProductServiceImpl(ProductRepository repository, BrandService brandService) {
        this.repository = repository;
        this.brandService = brandService;
    }

    public List<Product> getAllProducts() {
        return repository.findAll();

    }

    public void addProduct(Product product) {
        repository.save(product);
    }

    public Product getProductById(UUID id) {
        return repository.findById(id).orElseThrow(()-> new IllegalArgumentException("Product not found"));
    }

    public void deleteProductById(UUID id) {
        repository.deleteById(id);
    }


    @Override
    public void updateProductCost(UUID id, BigDecimal cost) {
        Product target = repository.findById(id).orElseThrow(()->new IllegalArgumentException("Product not found"));

        target.setCost(cost);
        repository.save(target);
    }

    @Override
    public void updateProductBrand(UUID id, int brandId) {
        Product target = repository.findById(id).orElseThrow(()->new IllegalArgumentException("Product not found"));
        Brand targetBrand= brandService.getBrandById(brandId);
        target.setBrand(targetBrand);
    }

    @Override
    public List<Product> findProductsByBrandName(String brandName) {
        Brand targetBrand= brandService.getBrandByName(brandName);
        int brandId = targetBrand.getId();
        return repository.findProductsByBrandId(brandId);
    }

    @Override
    public List<Product> findProductsByCarType(int carTypeId) {
        return List.of();
    }

    @Override
    public List<Product> searchProductsByKeyword(String keyword) {
        return repository.findByNameContaining(keyword);
    }
}
