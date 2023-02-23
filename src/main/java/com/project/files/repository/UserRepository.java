package com.project.files.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.files.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
