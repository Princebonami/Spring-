package com.spring.LifeCycleOfBeans;

public class Student {
	
	private int id;
	private String name;
	private Address address;
	
	public Student() {
		super();
	}

	public Student(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	public void init()
	{
		System.out.println("Init method of student gets called");
	}
	
	public void destroy()
	{
		System.out.println("Destroy method of student gets called");
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ",Address="+address;
	}
		

}
