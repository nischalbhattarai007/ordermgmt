package com.example.ordermgmt.repository;

import com.example.ordermgmt.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Integer> {
}
