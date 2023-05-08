package com.example.demo.P1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;

public class Project3 {
 
@Value("${namevalue:restapi}")
	
    public String name;
    
    @GetMapping("/velu")
	
	public String hight()
	{
		return "welcome to "+name;
	}
}
