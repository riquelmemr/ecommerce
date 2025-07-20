package com.javacourse.ecommerce.config;

import com.javacourse.ecommerce.entities.Category;
import com.javacourse.ecommerce.entities.Order;
import com.javacourse.ecommerce.entities.User;
import com.javacourse.ecommerce.enums.OrderStatus;
import com.javacourse.ecommerce.repositories.CategoryRepository;
import com.javacourse.ecommerce.repositories.OrderRepository;
import com.javacourse.ecommerce.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class ConfigTest implements CommandLineRunner {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Maria Brown", "988888888", "maria@gmail.com", "123456");
        User u2 = new User(null, "Alex Green", "977777777", "alex@gmail.com", "123456");

        Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);

        Category cat1 = new Category(null, "ELETRONICS", "Electronics");
        Category cat2 = new Category(null, "BOOKS", "Books");
        Category cat3 = new Category(null, "COMPUTERS", "Computers");

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
    }
}
