package com.javacourse.ecommerce.controllers;

import com.javacourse.ecommerce.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserController {
    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(1L, "Riquelme", "51980432298", "rique@dev.com", "123");
        return ResponseEntity.ok().body(user);
    }
}
