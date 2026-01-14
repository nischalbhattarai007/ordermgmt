package com.example.ordermgmt.controller;

import com.example.ordermgmt.model.Product;
import com.example.ordermgmt.repository.ProductRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {
    private ProductRepository productRepository;
    public ProductController(ProductRepository productRepository){
        this.productRepository=productRepository;
    }
    @PostMapping
    public Product createProduct(@RequestBody Product p){
        return productRepository.save(p);
    }
}
