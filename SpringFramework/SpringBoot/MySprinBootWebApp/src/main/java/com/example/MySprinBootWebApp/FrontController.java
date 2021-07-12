package com.example.MySprinBootWebApp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FrontController {
	
	
	/*
	@RequestMapping("home")
	public String home(HttpServletRequest req, HttpServletResponse res) {
		
		HttpSession session = req.getSession();
		String name = req.getParameter("name");
		System.out.println("Hi "+name);
		//req.setAttribute(name, o);
		session.setAttribute("name", name);
		System.out.println("Hi Sohan");
		return "home";
	}
	
	*/
	/*
	
	@RequestMapping("home")
	public String home(String name,HttpSession session) {
		
		System.out.println("Hi "+name);
		session.setAttribute("name", name);
		System.out.println("Hi Sohan");
		return "home";
	}
	*/
	
	// if you want differernt parameter name on website and here the add
	// @RequestParam("name") before the parameter in home method
	// it will look something like this
	// public String home(@RequestParam("name") String name,HttpSession session) { }
	
	/*
	@RequestMapping("home")
	public ModelAndView home(@RequestParam("name") String myName) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("name",myName);
		mv.setViewName("home");
		
		System.out.println("Hi Sohan");
		return mv;
	}
	*/
	
	@RequestMapping("home")
	public ModelAndView home(Customer customer) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("obj",customer);
		
		mv.setViewName("home");
		
		System.out.println("Hi Sohan");
		return mv;
	}
}
