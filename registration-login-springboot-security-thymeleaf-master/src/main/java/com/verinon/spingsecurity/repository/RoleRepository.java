package com.verinon.spingsecurity.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.verinon.spingsecurity.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
