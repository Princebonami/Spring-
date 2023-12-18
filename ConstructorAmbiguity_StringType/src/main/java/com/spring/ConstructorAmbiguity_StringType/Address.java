package com.spring.ConstructorAmbiguity_StringType;

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

	@Override
	public String toString() {
		return "city=" + city + ", state=" + state;
	}	

}
