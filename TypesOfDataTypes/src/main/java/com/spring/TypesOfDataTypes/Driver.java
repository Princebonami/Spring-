package com.spring.TypesOfDataTypes;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.function.Consumer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/TypesOfDataTypes/config.xml");
		Address address=context.getBean("address",Address.class);
		System.out.println(address.getCity());
		System.out.println(address.getState());
		Set<String> s1=address.getLoc();
		s1.forEach(new Consumer<String>() {

			@Override
			public void accept(String t) {
				System.out.print(t+" ");
				
			}
		});
		Properties p1=address.getMon();
		Set pro=p1.entrySet();
		Iterator i1=pro.iterator();
		while(i1.hasNext())
		{
			System.out.println(i1.next()+" ");
		}
		
		System.out.println("===============================================================");
		
		Student student = context.getBean("student",Student.class);
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getAddress());
		List<String> cou=student.getCourses();
		cou.forEach(co->{
			System.out.print(co+" ");
		});
		System.out.println();
		Map<Integer,String> m1=student.getHobbies();
		for(Map.Entry<Integer,String> e1 :m1.entrySet())
		{
			System.out.println(e1.getKey()+" "+e1.getValue());
		}
		// for ocnstructor injection everything is same but the only difference is we have to use <constructor-args> in the place of 
		// <property and on the place of p schema we have to use c schema.
		/*
		 *   if we do not use p chema then method to provide value like 
		 *   
		 *   <property name="id" value="1"/>   for primitive type 
		 *   <property name="address" ref="address" />  for refrence type 
		 *   
		 *   
		 *   
		 *   and now if we  don't want to use value in property then
		 *   
		 *   <property name="id">
		 *     <value>1</value>
		 *   </property>
		 *   
		 *   <property name="address">
		 *     <ref bean="address" />
		 *   </property>
		 *   
		 *   for construtor injection only we have to use <construtor-args> on the place of <property>
		 *   
		 */
		

	}

}
