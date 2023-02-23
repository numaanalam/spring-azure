package com.project.files.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.files.entities.User;
import com.project.files.repository.UserRepository;

@Service
public class UserService {
    @Autowired
    private UserRepository repo;

    public List<User> getUsers() {
	return repo.findAll();
    }

    public User saveUser(User user) {
	return repo.save(user);
    }

}