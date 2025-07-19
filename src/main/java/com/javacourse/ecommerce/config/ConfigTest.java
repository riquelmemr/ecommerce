package com.javacourse.ecommerce.config;

import com.javacourse.ecommerce.entities.User;
import com.javacourse.ecommerce.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class ConfigTest implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "988888888", "maria@gmail.com", "123456");
        User u2 = new User(null, "Alex Green", "977777777", "alex@gmail.com", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
