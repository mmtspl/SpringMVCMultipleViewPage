package com.mmtspl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class HelloController {
@RequestMapping("/hello")
	public String redirect()
	{
		return "viewpage";
	}	
@RequestMapping("/helloagain")
public String display()
{
	return "final";
}
}
