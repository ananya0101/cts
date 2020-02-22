package com.p1.p1;
public class ConstructorInjection {
	  /*private String message = null;

	  public ConstructorInjection(String message) {
	    this.message = message;
	  }

	  public String getMessage() {
	    return message;
	  }

	  public void setMessage(String message) {
	    this.message = message;
	  }*/
	  private String name = null;
	  private int roll;

	  public ConstructorInjection(String name, int roll) {
	    this.name = name;
	    this.roll = roll;
	  }

	  public String getMessage() {
	    return name;
	  }
	  
	  public int getValue() {
	    return roll;
}
}