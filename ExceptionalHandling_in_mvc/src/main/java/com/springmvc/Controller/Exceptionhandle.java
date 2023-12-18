package com.springmvc.Controller;

import java.util.InputMismatchException;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Exceptionhandle {
	
	@ExceptionHandler({NullPointerException.class,InputMismatchException.class})
	public String exception1()
	{
		return "exception";
	}

}
