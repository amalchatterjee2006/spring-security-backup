package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class hello 
{
	@RequestMapping("/")
	public String showHome()
	{
		return "index";
	}
	
	@RequestMapping("/login")
	public String showHome1()
	{
		return "login";
	}
	
	
	@RequestMapping("/end")
	public String showHome2()
	{
		return "end";
	}
	
	
	@RequestMapping("/error")
	public String showHome3()
	{
		return "error";
	}
	

}
