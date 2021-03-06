package com.cue.CoursesWebApp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CoursesController {
	
	
	/*
	@RequestMapping("/courses")
//	@ResponseBody                          // is used to return body and not file.jsp
	public String courses(HttpServletRequest req) {
		System.out.println("Welcome to courses");
		
		//pass client data
		
		HttpSession session = req.getSession();
		String cname = req.getParameter("cname");
		session.setAttribute("cname", cname);
		System.out.println("The course name is:"+cname);
		return "course";
	}
	*/
	
	@RequestMapping("/courses")
	public ModelAndView courses(@RequestParam("cname")String coursename, HttpSession session) {
		System.out.println("Welcome to courses");
		ModelAndView mv = new ModelAndView();
		mv.addObject("cname",coursename);
		mv.setViewName("course");
		return mv;
	}
}
