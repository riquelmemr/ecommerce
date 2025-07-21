package com.javacourse.ecommerce.services.product;

import com.javacourse.ecommerce.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll();
    Product findById(Long id);
}
