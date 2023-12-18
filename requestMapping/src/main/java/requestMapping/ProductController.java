package requestMapping;

import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	/*
	 *  in sam eprojetc we inclued running of handler 
	 */
	@RequestMapping("/test")  // request mapping is annotation which is used to target the handler 
	public String home()
	{
		System.out.println("Home handler gets executed");
		return "index";
	}
	
	/*
	 *  sending data from controller to view
	 *  
	 */
	@RequestMapping("/test1")
	public String test(Model model)
	{
		System.out.println("test handler gets executed");
		System.out.println("Enter the name of the employee :");
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		model.addAttribute("name",name);
		return "home";
	}
	
	/*
	 * Request mapping is a class level annotation as well as method level annotations like if we use at class level then we have to 
	 * write in url firstly class level handler url and then method level handler
	 */
	
	/*
	 *  in same projetc i will configure the pathVariable annotation like 
	 *  
	 *  @pathVariable like this annotation is used to perform ampping of the data coming from client side in the form of url to the 
	 *  specified variable so that we can use it in our program.
	 */
	
	@RequestMapping("/run/{name}")
	public String run(@PathVariable("name") String name,Model model)
	{
		System.out.println("Run method works");
		System.out.println(name);
		model.addAttribute("name",name);
		return "prince";
	}
	
	
	

}
