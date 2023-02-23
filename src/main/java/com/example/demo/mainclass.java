package com.example.demo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class mainclass {	
	@Value("${name}")	
	private String name;  
@GetMapping("/")    
public String Welcome(){        
	return "My favorite color is  "+name;    
	}    
}