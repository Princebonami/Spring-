package lifeCycleOfBeans_byusing_annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Address {
	
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
	@PostConstruct
	public void run()
	{
		System.out.println("Init method of address gets called");
	}
	@PreDestroy
	public void walk()
	{
		System.out.println("destroy method of address gets called");
	}

	@Override
	public String toString() {
		return "city=" + city + ", state=" + state;
	}
	
	

}
