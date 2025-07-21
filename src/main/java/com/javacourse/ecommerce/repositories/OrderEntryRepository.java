package com.javacourse.ecommerce.repositories;

import com.javacourse.ecommerce.entities.OrderEntry;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderEntryRepository extends JpaRepository<OrderEntry, Long> {
}
