package com.vatsal.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vatsal.productservice.model.Product;

public interface ProductRepository extends MongoRepository<Product, String> {
}
