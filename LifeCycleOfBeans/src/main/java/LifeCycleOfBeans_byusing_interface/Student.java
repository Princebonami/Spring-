package LifeCycleOfBeans_byusing_interface;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean,DisposableBean{
	
	private int id;
	private String name;
	private Address address;
	
	public Student() {
		super();
	}

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
	
	@Override
	public void destroy() throws Exception {
		
		System.out.println("The destroy method of student gets called");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("The init method of studnet gets called");
		
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	
	

}
