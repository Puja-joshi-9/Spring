package com.bwat.springproject.dao;

import java.util.List;

import com.bwat.springproject.model.Employee;

public interface EmployeeDao {
	
	void addEmployee(Employee emp);
	void deleteEmployee(int id);
	void updateEmployee(Employee emp);
	
	Employee getById(int id);
	
	List<Employee> getAllEmployee();

}
