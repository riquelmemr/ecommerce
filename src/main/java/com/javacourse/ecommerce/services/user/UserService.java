package com.javacourse.ecommerce.services.user;

import com.javacourse.ecommerce.entities.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    User findById(Long id);
    User create(User user);
    void delete(Long id);
    User update(Long id, User user);
}
