package com.spring.Autowire_and_Component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		/*
		 *  as the ioc container scans the xml then it scans the base package and then it found @component then it create sobject of address
		 *  and then it create beanof Studnet then it scan @autowire and then it inject address in @autowire. 
		 */
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/Autowire_and_Component/config.xml");
		Address address=context.getBean("address",Address.class);
		System.out.println(address);
		
		System.out.println("==========================================================");
		
		Student student=context.getBean("student",Student.class);
		System.out.println(student);

	}

}
