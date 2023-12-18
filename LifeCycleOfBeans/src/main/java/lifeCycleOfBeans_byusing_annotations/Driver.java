package lifeCycleOfBeans_byusing_annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		
		/*
		 *   Here  we have to use the annotation to call the init and destroy method so spring provide us two annotations to call there methods
		 *   1) @postConstruct - this annotation tells the ioc container that it is an init method.
		 *   2) @preDestroy- this annotations tells the ioc container that it is an destroy method.
		 */
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("lifeCycleOfBeans_byusing_annotations/config.xml");
		Address address=context.getBean("address",Address.class);
		System.out.println(address);
		
		System.out.println("==========================================================================");
		
		Student student=context.getBean("student",Student.class);
		System.out.println(student);
		context.registerShutdownHook();
		
		/*
		 *  Application context is only used to call the init method only @postConstruct type only but for @preDestroy we have to use
		 *  AbstractApplicationContext i.e like we have to call registerShutDownHook();
		 *  
		 */
	}

}
