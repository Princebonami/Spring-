package com.spring.LifeCycleOfBeans;

public class Address {
	
	private String city;
	private String state;
	
	public Address() {
		super();
	}

	public Address(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
	
	public void init()
	{
		System.out.println("Init method of address gets called");
	}
	public void destroy()
	{
		System.out.println("Destroy method of address gets called");
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + "]";
	}
		

}
