package com.spring.LifeCycleOfBeans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	
	public static void main(String[] args) {
		// now here we have to done life cycle of beans like in life cycle firstly the Objetc of the beans gets created by 
		/*
		 *   ioc containter i.e inversion of control container with the help of xml file and as the obhetc gets created then internaly 
		 *   can say setter method or cunstructor whatever injection you yse called and initialize the value then as the object gets created and 
		 *   dependency injection performed by ioc container then init method gets called that init method is for initialization i.e 
		 *   as the objetc gets created then it require some connections like datsbase connections and system connections and network connections
		 *   web services connections and then as the initialization gets done by init method then after our code get out that objetc 
		 *   and used in our program and thena s the work of that object gets completed then destroy method calls before deletingg the object
		 *   then destroy method detach all the connections and then the objetc gets deleted.
		 *   
		 *   so we can call init and destroy method by three ways :--
		 *   1) by uisng xml 
		 *   2) by uisng interfaces i.e like initializing Bean and Disposable Bean
		 *   3) by uisng anotations.
		 *   
		 *   ***** so Firstly by uinsg xml *****
		 */
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/spring/LifeCycleOfBeans/config.xml");
		Address address=context.getBean("address",Address.class);
		System.out.println(address);
		
		System.out.println("=====================================================================================");
		
		Student student=context.getBean("student",Student.class);
		System.out.println(student);
		context.registerShutdownHook();
		
		
		/*
		 *   WIth the help of ApplicationContext we can only call init method but for destroy method we have to use AbstratcApplicationContext
		 *   with the help of AbstractApplicationContext we have to call destroy method in AbstractApplicationContext we have to call registerShutDownHook() method 
		 *   to call destroy method.
		 *   
		 *   ApplicationContext is the parent Interface of AbstractApplictionContext.
		 */
	}
	
}
