package com.jncp.dao;

import java.util.List;

import com.jncp.model.Employee;

public interface EmployeeDao {

	public Employee getEmployee(int empId);
	
	public List<Employee> searchEmployee(String firstName);
	
	public void insertEmployee();
}
