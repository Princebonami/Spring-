package com.spring.BeanScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		/*
		 *  There are 5 type sof scope of beans :-  i.e type sof beans can say or can say on the basis of distribution of memory 
		 *  types of bens
		 *  
		 *  1) Singleton=in this ioc container creates the objetx and as with the help of ApplicationContext if we want to get the 
		 *  object then as much objetc we take out from the ioc containre bydefault all the memory have same hashcode.I.e all the object have
		 *  same hashcode.
		 *  
		 *  2) prototype- if we use scope a sprototype then as much objetc we take out from the oc container all have 
		 *  different hashcode it means as we get the object from ioc container a new memory gets provided to the object
		 *  and then because of that only we got different hashcode.
		 *  
		 *  3) request and session-both are used in WEb application creation i.e in Httprequest and Httpsession simultaneously.
		 *  4) global session- it is used in portlet application not we does not use portel it is similar as servlet some exmaple is email etc.
		 *  
		 *     // by default it is stereotype type we can
		 */
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/BeanScope/config.xml");
		Address address=context.getBean("address",Address.class);
		System.out.println(address.hashCode());
		Address address1=context.getBean("address",Address.class);
		System.out.println(address1.hashCode());
		System.out.println("=============================================================================");
		
		Student student=context.getBean("student",Student.class);
		System.out.println(student.hashCode());
		Student student1=context.getBean("student",Student.class);
		System.out.println(student1.hashCode());
		
		/*
		 *   we can provide scope in two ways 1) by uisng xml in xml we use scope attribute and 2) by using @scope annotations.
		 */

	}

}
