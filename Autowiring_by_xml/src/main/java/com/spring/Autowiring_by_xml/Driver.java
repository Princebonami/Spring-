package com.spring.Autowiring_by_xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
	  
		/*
		 *  Autowiring is defined as that it is a feature of Spring framework which is used to perform dependency injection
		 *  automatically.
		 *  
		 *  it only supports refrence type data it does not support primitve as well as string type data .
		 *  
		 *  so lets implement it we perform autowiring by using various ways :---
		 *  
		 *  1) by uisng xml( in xml there are various mode )
		 *     byName in this mode ioc conatiner scans the name of the refrence and the name of the beans and then if fond then deoendency
		 *     injection occur
		 */
		System.out.println(" ========================This is the example of autowire by Name============");
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/Autowiring_by_xml/config.xml");
		Address address=context.getBean("address",Address.class);
		System.out.println(address);
		
		System.out.println("========================================================================================");
		
		Student student=context.getBean("student",Student.class);
		System.out.println(student);
	
	}

}
