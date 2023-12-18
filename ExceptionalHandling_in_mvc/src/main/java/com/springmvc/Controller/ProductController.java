package com.springmvc.Controller;

import java.util.InputMismatchException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProductController {
	
	/* 
	 * 
	 * here we use @ExceptionalHandler annotation that annotation is used to handle exception if we use it in same page to handle particlar
	 * hadler exception available in particular controller but if we want that in this package if all pojo classes exception get handle by 
	 * a single class then we have to take @controllerAdvice this annotations told ioc container that all the exception handler available in
	 * particular class.
	 *  
	 */
	@RequestMapping("/test")
	public String home()
	{
		System.out.println("Home handler run");
		String name=null;
		System.out.println(name.length());
		return "index";
	}
	


}
