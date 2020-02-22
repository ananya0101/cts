package com.vp.model;

import java.util.List;

public class Employee {
	private String name;
	private Integer age;
	private String email;
	private String gender;
	private List<String> skil;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public List<String> getSkil() {
		return skil;
	}
	public void setSkil(List<String> skil) {
		this.skil = skil;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", email=" + email + ", gender=" + gender + ", skil=" + skil
				+ "]";
	}
}