package com.cue;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AddController {
	
	@RequestMapping("/",method = RequestMethod.GET)
	public String display() {
		return "index";
	}
	
	@RequestMapping("add")
	public String add() {
		
		System.out.println("Sohan");
		return "display";
	}
	
	
	@RequestMapping("hello",method = RequestMethod.GET)  
    public String redirect()  
    {  
        return "viewpage";  
    }     

	@RequestMapping("helloagain")  
	public String display()  
	{  
	    return "final";  
	} 

}