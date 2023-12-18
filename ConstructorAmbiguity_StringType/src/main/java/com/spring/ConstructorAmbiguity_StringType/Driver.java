package com.spring.ConstructorAmbiguity_StringType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		/*
		 *   here we take constructor overloading as we all know in xml accepts all the value in the form of String and 
		 *   becaus of that if dependency injection occur then it by default d=search all string type data if found then it call that 
		 *   constructor having all string type data and if not found then call if present f=double type if not found then call integer 
		 *   type constructor.
		 */
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/ConstructorAmbiguity_StringType/config.xml");
		Address address=context.getBean("address",Address.class);
		System.out.println(address);
		
		System.out.println("===========================================================================");
		
		Student student=context.getBean("student",Student.class);
		System.out.println(student);
		/*
		 *   if we want to choose constructor as our own choice then we have to use an attribuate of bean tage that is type
		 *   
		 *   if there are two integer type value then we can also change the or can say exchaneg the valye by using 
		 *   attribute of index="0" for first integer and index="1" for second index.
		 */
		
	}

}
