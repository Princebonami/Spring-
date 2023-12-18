package byType_mode;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
	public static void main(String[] args) {
	  
		/*
		 *   here w ehave to perform autowiring by uinsg xml mode byTYpe
		 *   
		 *   1) in byType ioc container as scan the xml file and as found byType then it cheks the type of the refrence and check the 
		 *   class in beans if both are same then auto wiring occured. 
		 */
		System.out.println(" ========================This is the example of autowire by Type============");
		ApplicationContext context=new ClassPathXmlApplicationContext("byType_mode/config.xml");
		Address address=context.getBean("address",Address.class);
		System.out.println(address);
		
		System.out.println("========================================================================================");
		
		Student student=context.getBean("student",Student.class);
		System.out.println(student);
		
		/*
		 *  in by type there is an ambiguity occured like if there are two beans of the same pojo classes then
		 *  we got the exception that we found two objetc of same class hence which class we have to take under consideration.
		 */
	
	}

}
