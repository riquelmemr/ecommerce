package com.javacourse.ecommerce.services.user.impl;

import com.javacourse.ecommerce.entities.User;
import com.javacourse.ecommerce.repositories.UserRepository;
import com.javacourse.ecommerce.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.get();
    }
}
