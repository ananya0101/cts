package com;

public class User {
	private String userName;
	private int age;
	private String emil;
	
	public User(String userName, int age, String emil) {
		this.userName = userName;
		this.age = age;
		this.emil = emil;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmil() {
		return emil;
	}
	public void setEmil(String emil) {
		this.emil = emil;
	}
}
