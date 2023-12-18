package com.spring.ConstructorAmbiguity_StringType;

public class Student {
	
	private int id;
	private String name;
	private Address address;
	
	public Student() {
		super();
	}

	public Student(int id, String name, Address address) {
		super();
		System.out.println("Integer type constructor");
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public Student(double id, String name, Address address) {
		super();
		System.out.println("Double type constructor");
		this.id = (int)id;
		this.name = name;
		this.address = address;
	}

	public Student(String id, String name, Address address) {
		super();
		System.out.println("String type Constructor");
		this.id = Integer.parseInt(id);
		this.name = name;
		this.address = address;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", address=" + address;
	}
	
	
	
	

}
