package com.tka.client;

import com.tka.dao.EmployeeDao;
import com.tka.entity.Employee;

public class UpdateEmployee {

	public static void main(String[] args) {
		
		Employee emp=new Employee();
		emp.setName("Pawan");
		emp.setEmailid("pawan@gmail.com");
		emp.setMobileno("2244669977");
		emp.setId(3);
		
		EmployeeDao dao=new EmployeeDao();
		int status= dao.updateEmployee(emp);
		if(status>0) {
			System.out.println("Data is Updated");
		}else{
			System.out.println("Data is not Updated");
		}
		

	}

}
