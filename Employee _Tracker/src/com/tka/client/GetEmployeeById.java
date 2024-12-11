package com.tka.client;

import com.tka.dao.EmployeeDao;
import com.tka.entity.Employee;

public class GetEmployeeById {

	public static void main(String[] args) {
		EmployeeDao dao = new EmployeeDao();
		int empId = 2;
		Employee employee = dao.getEmployeeById(empId);
	    if (employee.getId() > 0 ) {
	        System.out.println("Employee Details:");
	        System.out.println("ID: " + employee.getId());
	        System.out.println("Name: " + employee.getName());
	        System.out.println("Email ID: " + employee.getEmailid());
	        System.out.println("Mobile No: " + employee.getMobileno());
	    } else {
	        System.out.println("Employee with ID " + empId + " not found.");
	    } 
		
	}

}
