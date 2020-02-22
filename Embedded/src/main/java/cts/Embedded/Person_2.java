package cts.Embedded;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PERSON_EMBD")
public class Person_2 {
	
  @Id
  @GeneratedValue
  private int pid;
  
  private String name;
  
  @Embedded
  private Address address;
  
  @Override
  public String toString() {
	return "Person [pid=" + pid + ", name=" + name + ", address=" + address + "]";
  }

  public Person_2(int pid, String name, Address address) {
	super();
	this.pid = pid;
	this.name = name;
	this.address = address;
  }

  public Person_2() {
	super();
	// TODO Auto-generated constructor stub
  }

  public int getPid() {
	return pid;
  }

  public void setPid(int pid) {
	this.pid = pid;
  }

  public String getName() {
	return name;
  }

  public void setName(String name) {
	this.name = name;
  }

  public Address getAddress() {
	return address;
  }

  public void setAddress(Address address) {
	this.address = address;
  }

  
}

