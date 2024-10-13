package com.jerikho.securitywithjwt.repository;

import com.jerikho.securitywithjwt.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Integer> {
    Users findByUsername(String username);
}
