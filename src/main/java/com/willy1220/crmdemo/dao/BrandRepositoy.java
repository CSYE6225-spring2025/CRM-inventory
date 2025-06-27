package com.willy1220.crmdemo.dao;


import com.willy1220.crmdemo.model.Brand;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepositoy extends CrudRepository<Brand, Integer> {
    Brand findByName(String brandName);
}
