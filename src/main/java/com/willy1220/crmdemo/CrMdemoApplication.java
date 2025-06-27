package com.willy1220.crmdemo;

import com.willy1220.crmdemo.dao.BrandRepositoy;
import com.willy1220.crmdemo.model.Brand;
import com.willy1220.crmdemo.model.Product;
import com.willy1220.crmdemo.service.brand.BrandService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class CrMdemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CrMdemoApplication.class, args);

		String[] beanNames = context.getBeanDefinitionNames();






	}


}
