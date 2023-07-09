package com.depentinject.EmployeeServiceTest;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestEmployeeController 
{
	private Employee employee;

	public Employee getEmployee() 
	{
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	
	

	
}