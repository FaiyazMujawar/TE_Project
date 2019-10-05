package com.spring.project.api.repositories;

import java.util.List;
import java.util.Optional;

import com.spring.project.api.tables.User;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserRepository
 */
public interface UserRepository extends JpaRepository<User,Integer>{

    public List<User> findByrolesId(int roleId);
    public Optional<User> findByrolesIdAndId(int roleId,int id);
    // public List<User> findByeventsIdAndrolesId(int eventId,int roleId);      This query is giving error...

}