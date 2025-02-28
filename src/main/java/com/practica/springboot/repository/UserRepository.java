package com.practica.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.practica.springboot.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}
