package com.verinon.spingsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.verinon.spingsecurity.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
