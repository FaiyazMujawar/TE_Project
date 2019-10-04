package com.spring.project.api.services;

import java.util.List;
import java.util.Optional;

import com.spring.project.api.repositories.RoleRepository;
import com.spring.project.api.tables.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * RoleService
 */
@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public void addRole(Role role) {
        roleRepository.save(role);
    }

    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    public Optional<Role> getRole(int roleId) {
        return roleRepository.findById(roleId);
    }

    public void updateRole(Role role) {
        roleRepository.save(role);
    }

    public void removeRole(int roleId) {
        roleRepository.deleteById(roleId);
    }
}