package constructor_mode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		/*
		 *   here we have to perform by using constructor mode here by uinsg constrictor autowiring done.
		 */
		
		ApplicationContext context=new ClassPathXmlApplicationContext("constructor_mode/config.xml");
		Address address=context.getBean("address",Address.class);
		System.out.println(address);
		
		System.out.println("==============================================================================");
		
		Student student=context.getBean("student",Student.class);
		System.out.println(student);

	}

}
