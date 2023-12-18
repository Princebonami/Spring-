package BeanScope_using_Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
            /*
             *  we can use scope annotation only when we use @component.		
             */
		ApplicationContext context=new ClassPathXmlApplicationContext("BeanScope_using_Annotations/config.xml");
		Address address=context.getBean("address",Address.class);
		System.out.println(address.hashCode());
		Address address1=context.getBean("address",Address.class);
		System.out.println(address1.hashCode());
		System.out.println("=============================================================================");
		
		Student student=context.getBean("student",Student.class);
		System.out.println(student.hashCode());
		Student student1=context.getBean("student",Student.class);
		System.out.println(student1.hashCode());
		
	}

}
