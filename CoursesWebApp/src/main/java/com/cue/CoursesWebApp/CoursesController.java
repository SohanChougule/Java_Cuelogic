package com.cue.CoursesWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CoursesController {
	
	@RequestMapping("/courses")
//	@ResponseBody                          // is used to return body and not file.jsp
	public String courses() {
		System.out.println("Welcome to courses");
		return "course.jsp";
	}

}
