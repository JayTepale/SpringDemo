package com.springcore.ci;

public class Course {
   String name;

	@Override
	public String toString() {
		
		return this.name;
	}

	public Course(String name) {
		super();
		this.name = name;
	}
}
