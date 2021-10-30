package com.brideglabz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.brideglabz.model.EmployeePayroll;

@Controller
public class EmployeePayrollController {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private EmployeePayrollService employeePayrollService;
	
	@RequestMapping("/homepage")
	public String homePage() {
		return "homepage.html";
	}

	@RequestMapping("/addemployee")
	public String addemployee() {
		System.out.println(" It is a employee Pay roll Aplication");
		return "addemployees.html";
	}
	
	
	@RequestMapping("/adddataintodb")
	public String addDataintoDb(@ModelAttribute("userFormData") EmployeePayroll datas)
	{		
		System.out.println(" Inside Controller..");
		employeePayrollService.insertEmployeeDetails(datas);		
		return "homepage.html";
	}
	
	@RequestMapping("/fetchusers")
	public void fetchData()
	{
		employeePayrollService.fetchEmployeeDetails();
	}

}
