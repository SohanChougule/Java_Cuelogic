package com.example.WebDatabase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FormController {
	
	@Autowired
	CustomersRepo repo;
	
	
	@RequestMapping("/")
	public String home() {
		
		return "home";
	}

	@RequestMapping("/details")
	public String details(Customers customers) {
		repo.save(customers);
		return "home";
	}
	
	@GetMapping("/getdetails")
	public String getdetails() {
		return "ViewCustomer";
	}
	
//	
//	@GetMapping("/home")
//	public String home() {	
//		return "home";
//	}
//	
	/*
	@PostMapping("/getdetails")
	public String viewdetails(@RequestParam("cid") String cid,
			@RequestParam("cname") String cname,
			@RequestParam("cemail") String cemail,
			ModelMap modelmap) 
	{
		modelmap.put("cid", cid);
		modelmap.put("cname", cname);
		modelmap.put("cemail", cemail);
		return "ViewCustomer";	
	}
	
	*/
	
	@PostMapping("/showdetails")
	public ModelAndView getdetails(@RequestParam("cid") Integer cid) 
	{
		ModelAndView mv = new ModelAndView("Retrieve");
		Customers customers = repo.findById(cid).orElse(null);
		mv.addObject(customers);
		return mv;	
	}
}
