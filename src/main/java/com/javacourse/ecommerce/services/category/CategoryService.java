package com.javacourse.ecommerce.services.category;

import com.javacourse.ecommerce.entities.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll();
    Category findById(Long id);
}
