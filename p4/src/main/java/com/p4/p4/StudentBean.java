package com.p4.p4;

public class StudentBean {
	  private String name;
	  private String address;

	  public String getName() {
	    return name;
	  }

	  public void setName(String name) {
	    this.name = name;
	  }

	  public String getAddress() {
	    return address;
	  }

	  public void setAddress(String address) {
	    this.address = address;
	  }

	  @Override
	  public String toString() {
	    return "Student [address=" + address + ", name=" + name + "]";
	  }
}