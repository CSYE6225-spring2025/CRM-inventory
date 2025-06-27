package com.willy1220.crmdemo.service.brand;

import com.willy1220.crmdemo.dao.BrandRepositoy;
import com.willy1220.crmdemo.model.Brand;
import com.willy1220.crmdemo.model.Product;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandService {

    private final BrandRepositoy brandRepositoy;

    public BrandService(BrandRepositoy brandRepositoy) {
        this.brandRepositoy = brandRepositoy;
    }

    public Brand getBrandById(int id) {
        return brandRepositoy.findById(id).orElseThrow(()-> new IllegalArgumentException("Invalid id: " + id));
    }

    public void addBrand(Brand brand) {
        brandRepositoy.save(brand);
    }

    public Brand getBrandByName(String brandName) {
        return brandRepositoy.findByName(brandName);
    }



}
