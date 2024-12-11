package com.tka.client;

import com.tka.dao.StudentDao;
import com.tka.entity.Student;

public class UpdateStudent {
	public static void main(String[] args) {
		Student st = new Student();
		st.setName("Samarth");
		st.setStd(9);
		st.setCity("Pune");
		st.setId(2);
		StudentDao  dao = new StudentDao();
		int status = dao.updateStudent(st);
		if (status > 0) {
			System.out.println("Student Updated...");
		}else {
			System.out.println("Student not Updated...");
		}
		
	}

}
