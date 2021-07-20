package com.example.WebRequests;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
	
	
//	@RequestMapping("/customers")
//	@ResponseBody
//	public String getCustomers() {
//		return repo.findAll().toString();
//	}
//	
//	@RequestMapping("/customers/2")
//	@ResponseBody
//	public String getCustomers2() {
//		return repo.findById(2).toString();
//	}
//	
//	@RequestMapping("/customers/{cid}")
//	@ResponseBody
//	public String getCustomers(@PathVariable int cid) {
//		return repo.findById(cid).toString();
//	}
//	
	@RequestMapping("/customers")
	@ResponseBody
	public List<Customers> getCustomers() {
		return repo.findAll();
	}
	
	@RequestMapping("/customers/{cid}")
	@ResponseBody
	public Optional<Customers> getCustomers(@PathVariable int cid) {
		return repo.findById(cid);
	}
	
	
	@PostMapping("/customers")
	@ResponseBody
	public Customers getCustomers3(@RequestBody Customers customer) {
		repo.save(customer);
		return customer;
	}
	
	
	@DeleteMapping("/customers/{cid}")
	@ResponseBody
	public Customers getCustomers4(@PathVariable("cid") int cid) {
		Customers cust = repo.getOne(cid);
		repo.delete(cust);
		return cust;
	}
	
	@PutMapping(path="/customers",consumes= {"application/json"})
	@ResponseBody
	public Customers getCustomers5(@RequestBody Customers customer) {
		repo.save(customer);
		return customer;
	}
	
}
