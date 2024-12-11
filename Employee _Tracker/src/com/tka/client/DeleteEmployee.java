package com.tka.client;

import com.tka.dao.EmployeeDao;

public class DeleteEmployee {
	
	public static void main(String[] args) {
		
		EmployeeDao dao=new EmployeeDao();
		int status= dao.deleteData(2);
		if(status>0) {
			System.out.println("Data is Deleted");
		}else{
			System.out.println("Data is not Deleted");
		}
	}

}
