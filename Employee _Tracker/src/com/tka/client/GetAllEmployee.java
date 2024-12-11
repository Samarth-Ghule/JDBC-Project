package com.tka.client;

import java.util.List;

import com.tka.dao.EmployeeDao;
import com.tka.entity.Employee;

public class GetAllEmployee {
	public static void main(String[] args) {
		
		EmployeeDao dao=new EmployeeDao();
		List<Employee> list= dao.getAllRecord();
		System.out.println("--------------------------");
		for (Employee employee : list) {
			System.out.println("ID : "+employee.getId());
			System.out.println("Name : "+employee.getName());
			System.out.println("Email ID : "+employee.getEmailid());
			System.out.println("Mobile No : "+employee.getMobileno());
			System.out.println("--------------------------");
		}
	}
	
	
		

}
