package com.tka.client;

import com.tka.dao.StudentDao;
import com.tka.entity.Student;

public class InsertStudent {
	public static void main(String[] args) {
		Student stu = new Student("Sam", 10, "Solapur");
		StudentDao dao = new StudentDao();
		int status = dao.insertStudent(stu);
		if (status>0) {
			System.out.println("Data Inserted Successful...");
		}else {
			System.out.println("Data Not Inserted...");
		}
	}

}
