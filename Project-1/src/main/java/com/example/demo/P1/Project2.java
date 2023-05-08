package com.example.demo.P1;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Project2 {

public String name="power";
	
	
	@RequestMapping("/rosh")
	@ResponseBody
	public String hello()
	{
		return "hi da "+name;
	}
}
