package com.project.files.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")

public class User {

    @Id
    @GeneratedValue
    private Integer id;
    private Integer rollno;
    private String email;

    public User(Integer id, Integer rollno, String email) {
	super();
	this.id = id;
	this.rollno = rollno;
	this.email = email;
    }

    public User() {
	super();
	// TODO Auto-generated constructor stub
    }

    public Integer getId() {
	return id;
    }

    public void setId(Integer id) {
	this.id = id;
    }

    public Integer getRollno() {
	return rollno;
    }

    public void setRollno(Integer rollno) {
	this.rollno = rollno;
    }

    public String getEmail() {
	return email;
    }

    public void setEmail(String email) {
	this.email = email;
    }

}