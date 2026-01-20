package com.example.ordermgmt.repository;

import com.example.ordermgmt.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
