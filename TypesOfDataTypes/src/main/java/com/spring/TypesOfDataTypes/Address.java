package com.spring.TypesOfDataTypes;

import java.util.Properties;
import java.util.Set;

public class Address {
	
	private String city;
	private String state;
	private Set<String> loc;
	private Properties mon;
	
	public Address() {
		super();
	}

//	public Address(String city, String state, Set<String> loc, Properties mon) {
//		super();
//		this.city = city;
//		this.state = state;
//		this.loc = loc;
//		this.mon = mon;
//	}

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

	public Set<String> getLoc() {
		return loc;
	}

	public void setLoc(Set<String> loc) {
		this.loc = loc;
	}

	public Properties getMon() {
		return mon;
	}

	public void setMon(Properties mon) {
		this.mon = mon;
	}

	@Override
	public String toString() {
		return "city=" + city + ", state=" + state + ", loc=" + loc + ", mon=" + mon;
	}
	
	
	
	

}
