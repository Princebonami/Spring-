package com.spring.TypesOfDataTypes;

import java.util.List;
import java.util.Map;

public class Student {
	
	private int id;
	private String name;
	private Address address;
	private List<String> courses;
	private Map<Integer,String> hobbies;
	
	
	public Student() {
		super();
	}


//	public Student(int id, String name, Address address, List<String> courses, Map<Integer, String> hobbies) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.address = address;
//		this.courses = courses;
//		this.hobbies = hobbies;
//	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public List<String> getCourses() {
		return courses;
	}


	public void setCourses(List<String> courses) {
		this.courses = courses;
	}


	public Map<Integer, String> getHobbies() {
		return hobbies;
	}


	public void setHobbies(Map<Integer, String> hobbies) {
		this.hobbies = hobbies;
	}


	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", courses=" + courses + ", hobbies=" + hobbies;
	}
	
	
	
	

}
