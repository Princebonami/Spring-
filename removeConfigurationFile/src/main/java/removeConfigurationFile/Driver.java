package removeConfigurationFile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Driver {

	public static void main(String[] args) {
		
		ApplicationContext context=new AnnotationConfigApplicationContext("removeConfigurationFile");
		Address address=context.getBean("address",Address.class);
		System.out.println(address);
		
		System.out.println("==============================================================================");
		
		Student student=context.getBean("student",Student.class);
		System.out.println(student);
		
		
		/*
		 *    @configuration is an annotation which is used to remove the configuration file it is used to tell ioc container that 
		 *    the particular class is an configuration file and @bean is used to provide informatuon to the ioc ocntainer to tell 
		 *    that this is the information of beans or this method act similar as <bean> tag.
		 */

	}

}
