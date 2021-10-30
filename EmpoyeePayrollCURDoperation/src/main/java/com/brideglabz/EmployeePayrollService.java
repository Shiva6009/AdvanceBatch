package com.brideglabz;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.brideglabz.model.EmployeePayroll;

@Service
public class EmployeePayrollService {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public void insertEmployeeDetails(EmployeePayroll datasobj) {
		// Insert Query into DB..
		String sql = "INSERT INTO details (employeeid, employeename, employeesalary , employeeaddress , employeeage) VALUES (?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql, datasobj.getEmployeeId(), datasobj.getEmployeeName(), datasobj.getEmployeeSalary(),
				datasobj.getEmployeeAddress(), datasobj.getEmployeeAge());
		System.out.println(" Data Inserted Successfully..");

	}
	
	public void fetchEmployeeDetails()
	{
		String sql  = "SELECT  * from details";
		List<Map<String , Object>> result = jdbcTemplate.queryForList(sql);
		System.out.println(" result "+ result);
		
	}

}
