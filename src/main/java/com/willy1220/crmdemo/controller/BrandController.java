package com.willy1220.crmdemo.controller;

import com.willy1220.crmdemo.model.Brand;
import com.willy1220.crmdemo.model.Product;
import com.willy1220.crmdemo.service.brand.BrandService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/brand")
public class BrandController {

    BrandService brandService;

    public BrandController(BrandService brandService) {
        this.brandService = brandService;
    }

    @PostMapping("/post")
    public void createBrand(@RequestBody Brand brand) {

        brandService.addBrand(brand);

    }



}
