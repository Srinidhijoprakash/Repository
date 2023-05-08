package com.example.demo.P1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller

public class P1 {

	@RequestMapping("/sri")
	@ResponseBody
	public String hyy()
	
	{
	 return "welcome arun";	
	}
}
