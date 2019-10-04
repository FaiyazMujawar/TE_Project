package com.spring.project.api.repositories;

import com.spring.project.api.tables.Role;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * RoleRepository
 */
public interface RoleRepository extends JpaRepository<Role,Integer>{

    
}