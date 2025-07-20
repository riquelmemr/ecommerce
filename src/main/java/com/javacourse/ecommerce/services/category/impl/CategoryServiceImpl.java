package com.javacourse.ecommerce.services.category.impl;

import com.javacourse.ecommerce.entities.Category;
import com.javacourse.ecommerce.repositories.CategoryRepository;
import com.javacourse.ecommerce.services.category.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category findById(Long id) {
        Optional<Category> category = categoryRepository.findById(id);
        return category.get();
    }
}
