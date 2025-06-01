package com.brunohfcharles.demo.repositories;

import com.brunohfcharles.demo.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
