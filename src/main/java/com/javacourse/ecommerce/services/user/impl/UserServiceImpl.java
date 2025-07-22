package com.javacourse.ecommerce.services.user.impl;

import com.javacourse.ecommerce.entities.User;
import com.javacourse.ecommerce.exceptions.DatabaseException;
import com.javacourse.ecommerce.exceptions.ModelNotFoundException;
import com.javacourse.ecommerce.repositories.UserRepository;
import com.javacourse.ecommerce.services.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
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
        return user.orElseThrow(() -> new ModelNotFoundException(id));
    }

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public void delete(Long id) {
        try {
            userRepository.findById(id).ifPresentOrElse(user -> {
                userRepository.delete(user);
            }, () -> {
                throw new ModelNotFoundException(id);
            });
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseException("Integrity violation: " + e.getMessage());
        }
    }

    @Override
    public User update(Long id, User user) {
        User entity = userRepository.getReferenceById(id);
        updateUserData(entity, user);
        return userRepository.save(entity);
    }

    private void updateUserData(User reference, User user) {
        reference.setEmail(user.getEmail());
        reference.setName(user.getName());
        reference.setPhone(user.getPhone());
    }
}
