package com.vatsal.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vatsal.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
