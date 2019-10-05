package com.spring.project.api.services;

import java.util.List;
import java.util.Optional;

import com.spring.project.api.repositories.UserRepository;
import com.spring.project.api.tables.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * UserService
 */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers(int roleId) {
        return userRepository.findByrolesId(roleId);
    }

    public Optional<User> getUser(int id,int roleId) {
        return userRepository.findByrolesIdAndId(id,roleId);
    }

    public void addUser(User user) {
        userRepository.save(user);
    }

    public void updateUser(User user) {
        userRepository.save(user);
    }

    public void deleteUser(int userId) {
        userRepository.deleteById(userId);
    }

    /* public List<User> getAllUsersOnEvent(int roleId,int eventId) {                   <- Here is the error!!
        return userRepository.findByeventsIdAndrolesId(eventId, roleId);
    } */
}