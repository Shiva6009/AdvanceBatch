package com.brideglabz.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.bridgelabz.pojo.User;

@Controller
public class Pratice_Controller {

	@GetMapping("/welcomemessage")   // UC1
	public String  welcomemessage() 
	{
		return "Hello From Bridgelabz..";
	}
	
	@GetMapping("/welcomewithqueryparameter")   // UC2
	public String welcomewithqueryparameter(@RequestParam("name") String name)
	{
		return "Hello From "+ name;
	}
	
	@GetMapping("/welcomewithpathvariable/{name}")   // UC3
	public String welcomewithpathvariable(@PathVariable String name)
	{
		return "Hello From "+ name;
	}

	@RequestMapping(value = "/loaduserForm", method = RequestMethod.GET)
	public String showUserForm(ModelMap model)  
	{
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("user");
		return "user";
	}
	
	@RequestMapping("/test")
	public String test() {
	    return "test.jsp";
	}
	
	 @RequestMapping("/index")
	    public ModelAndView myindex() {
	        return new ModelAndView("index");
	    }
	
	@PostMapping("/savedata")
	public String saveData(@RequestBody User user)
	{
	 
	    return "Welcome"+user;
	}
	
}