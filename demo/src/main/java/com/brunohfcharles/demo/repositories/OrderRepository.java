package com.brunohfcharles.demo.repositories;

import com.brunohfcharles.demo.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
