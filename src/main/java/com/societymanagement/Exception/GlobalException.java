package com.societymanagement.Exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalException  extends RuntimeException{
	
	
	private static final long serialVersionUID = 1L;
	
	
   @ExceptionHandler(NoHandlerFoundException.class)
   
	public void handlerNoHandlerFoundException(NoHandlerFoundException ex)
   {
	   System.out.println("THIS PAGE YOU ARE LOOKING FOR NOT AVAILABLE"); 
   }
} 
