package com.springcore.lcycle;

public class Example {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}
  
	public void start() {
		System.out.println("Starting method ");
	}
  
  public void end() {
	  System.out.println("Ending  method");
  }

}
