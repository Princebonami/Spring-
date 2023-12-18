package lifeCycleOfBeans_byusing_annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Student {
	
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
	@PostConstruct
	public void run()
	{
		System.out.println("Init method of student gets called");
	}
	@PreDestroy
	public void walk()
	{
		System.out.println("Destroy method of student gets called");
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", address=" + address;
	}
		

}
