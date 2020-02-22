package com.iiht.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class User {

   @Min(value = 100, message = "id can not be less than 100")
   @Max(value = 999, message = "id can not be grater than 999")
   private int id;
   
   @NotEmpty(message = "name con not be Empty..")
   private String name;
   
   @NotEmpty(message = "email can not be empty..")
   @Email
   private String email;

   
   
public User(int id, String name, String email) {
	this.id = id;
	this.name = name;
	this.email = email;
}

public User() {
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString() {
	return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
}   
   
}