package com.javacourse.ecommerce.services.order;

import com.javacourse.ecommerce.entities.Order;

import java.util.List;

public interface OrderService {
    List<Order> findAll();
    Order findById(Long id);
}
