package com.javacourse.ecommerce.repositories;

import com.javacourse.ecommerce.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
