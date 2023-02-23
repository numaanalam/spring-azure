package com.project.files.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project.files.entities.User;
import com.project.files.service.UserService;

@RestController

public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("/users")
    public ResponseEntity<Object> getUsers() {
	try {
	    return new ResponseEntity<>(service.getUsers(), HttpStatus.OK);
	} catch (Exception e) {
	    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }

    @PostMapping("/users")
    public ResponseEntity<Object> saveUser(@RequestBody User user) {
	try {
	    return new ResponseEntity<>(service.saveUser(user), HttpStatus.OK);
	} catch (Exception e) {
	    return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
    }

}