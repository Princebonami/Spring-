package com.spring.Autowire_and_Component;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
	
	@Value("Gorakhpur")
	private String city;
	@Value("UttarPradesh")
	private String state;
	
	public Address() {
		super();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "city=" + city + ", state=" + state;
	}
	
	
	
	

}
