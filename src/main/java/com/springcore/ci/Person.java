package com.springcore.ci;

public class Person {
	private String name;
	private int personId;
	private Course course;
	
	public Person(String name, int personId,Course course)
	{
		this.personId=personId;
		this.name=name;
		this.course=course;
		
		
		
	}
	@Override
	public String toString() {
		return this.name+" : "+this.personId+"{ "+this.course.name+" }";
	}

}
