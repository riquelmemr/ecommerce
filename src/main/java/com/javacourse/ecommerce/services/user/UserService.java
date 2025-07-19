package com.javacourse.ecommerce.services.user;

import com.javacourse.ecommerce.entities.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(Long id);
}
