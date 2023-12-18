package Autowiring_byusing_Annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		/*
		 *  here w ehave to perform autowiring by the use of @autowired annotations in this @autowored in only use to inject refrenc etype of data 
		 *  and then @autowired only use byTYpe mode of autowiring 
		 */
		
		/*
		 *   Advantages of @autowired annotations are :--
		 *   
		 *   1) less code
		 *   2) injections perform automatically
		 *   
		 *   disadvantage 
		 *   ===============================
		 *   
		 *   1) it only supports refrence type of dependency injection primitive as well as string not allowed.
		 *   2) programmer can't control it.
		 */
		
		ApplicationContext context=new ClassPathXmlApplicationContext("Autowiring_byusing_Annotation/config.xml");
		Address address=context.getBean("address",Address.class);
		System.out.println(address);
		
		System.out.println("==============================================================================");
		
		Student student=context.getBean("student",Student.class);
		System.out.println(student);
		
		/*
		 *   in @autowired as follws byTYpe hence if there are two beans of the same name is there then it shows ambiguity
		 *   like only shows first beans as answer hence if we want to inject beans as per our choice hence we have to use @qualifier
		 *   
		 *   this @qualifier is refrence level as well as setter method level anootations like if there are two beans having same class name 
		 *   then we have to use @Qualifier with the help of that help of that we can inject any beans as oer our choice.
		 */

	}

}
