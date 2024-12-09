package com.tka.client;

import com.tka.dao.EmployeeDao;
import com.tka.entity.Employee;

public class InsertEmployee {

	public static void main(String[] args) {
		
		Employee emp=new Employee("Ram","ram@gmail.com","7755638951");
		EmployeeDao dao=new EmployeeDao();
		int status= dao.insertData(emp);
		if(status>0) {
			System.out.println("Data insert successfully");
		}else {
			System.out.println("Data is not insert successfully");
		}
		
	}

}
