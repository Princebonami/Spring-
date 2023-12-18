package com.spring.Component_and_value;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Diver {

	public static void main(String[] args) {
		/*
		 * Component is defined a sthat it is an annotation i.e @component which is used to create object it is a classlevel
		 * annotation which is written above class as the ioc container scan the @componet then it understand that yes for this class
		 * objetc has to be created as the objetc gets created in the form of like if we write @componet above Student class
		 * then the object class gets created like Student student =new Student();
		 * 
		 * so if we want to get beans then we have to use student but if we want to chnage the refrence variable name then we have to write 
		 * @component("any name ") that it creates the objetc with this refrence name .
		 * 
		 * and if we want to provide value with annotation then we have to use @value("  ") annotations above member now 
		 * if we use @componet then how ioc container know which beans we have to create object how it scnas @component beans 
		 * of particular package we have to provide <context:component-scan base-package="  "/> then it scans all the component 
		 * of particular package and create objet of that.
		 * 
		 * 
		 */
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/Component_and_value/config.xml");
		Address address=context.getBean("address",Address.class);
		System.out.println(address);
		
		System.out.println("==================================================");
		
		Student student=context.getBean("student",Student.class);
		System.out.println(student);

	}

}
