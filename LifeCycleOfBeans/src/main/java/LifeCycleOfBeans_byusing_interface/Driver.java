package LifeCycleOfBeans_byusing_interface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		/*
		 *   Now here we have to perform i.e call init and destroy method by uisng interface 
		 *   
		 *   for init method calling spring provide interface are InitializingBean and in this interface there is a method name which
		 *   act similar as init method that method name is afterPropertiesSet() and for destroy there is an interface and that inetface is 
		 *   DisposableBean and the method inside this interface are destroy() method.
		 */
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("LifeCycleOfBeans_byusing_interface/config.xml");
		Address address=context.getBean("address",Address.class);
		System.out.println(address);
		
		System.out.println("==================================================================================");
		
		Student student=context.getBean("student",Student.class);
		System.out.println(student);
		context.registerShutdownHook();
		
		
		/*
		 *   init method gets called directly by implementing interfaces but for destroy method we have to use AbstractApplicationContext and the method inside this
		 *   interface is registerShutDownHook();
		 */
		

	}

}
