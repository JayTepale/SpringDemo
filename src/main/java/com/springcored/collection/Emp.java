package com.springcored.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	private String empName;
	private List<String> empPhones;
	private Set<String> empAddress;
	private Map<String,String> courses;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getEmpPhones() {
		return empPhones;
	}
	public void setEmpPhones(List<String> empPhones) {
		this.empPhones = empPhones;
	}
	public Set<String> getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(Set<String> empAddress) {
		this.empAddress = empAddress;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Emp(String empName, List<String> empPhones, Set<String> empAddress, Map<String, String> courses) {
		super();
		this.empName = empName;
		this.empPhones = empPhones;
		this.empAddress = empAddress;
		this.courses = courses;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Emp [empName=" + empName + ", empPhones=" + empPhones + ", empAddress=" + empAddress + ", courses="
				+ courses + "]";
	}

	

}
