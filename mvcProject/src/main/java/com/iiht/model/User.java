package com.iiht.model;

public class User {
   int uid;
   String name;
   int age;
public User() {
	super();
	// TODO Auto-generated constructor stub
}
public User(int uid, String name, int age) {
	super();
	this.uid = uid;
	this.name = name;
	this.age = age;
}
public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "User [uid=" + uid + ", name=" + name + ", age=" + age + "]";
}
   
}
