package com.spring.project.api.repositories;

import java.util.List;

import com.spring.project.api.tables.User;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * UserRepository
 */
public interface UserRepository extends JpaRepository<User,Integer>{

    public List<User> findByrolesId(int roleId);

    public List<User> findByrolesIdAndEventevent_id(int roleId,int eventId);

}