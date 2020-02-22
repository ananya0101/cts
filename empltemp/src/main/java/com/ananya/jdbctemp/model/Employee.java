package com.ananya.jdbctemp.model;

public class Employee {
   int eid;
   String name;
   int salary;
   @Override
public String toString() {
	return "Employees [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
}

public int getEid() {
	return eid;
}

public void setEid(int eid) {
	this.eid = eid;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getSalary() {
	return salary;
}

public void setSalary(int salary) {
	this.salary = salary;
}

   public Employee(int eid, String name, int salary) {
	super();
	this.eid = eid;
	this.name = name;
	this.salary = salary;
}

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
}