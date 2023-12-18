package LifeCycleOfBeans_byusing_interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Address implements InitializingBean,DisposableBean {
	
	private String city;
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
	public void destroy() throws Exception {
		
		System.out.println("The destroy method of address gets called");
		
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("The init method of address gets called");
	}


	@Override
	public String toString() {
		return "city=" + city + ", state=" + state;
	}


	

}
