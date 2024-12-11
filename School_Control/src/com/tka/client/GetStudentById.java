package com.tka.client;

import com.tka.dao.StudentDao;
import com.tka.entity.Student;

public class GetStudentById {
	public static void main(String[] args) {
		StudentDao dao = new StudentDao();
		int id = 50;
		Student st = dao.getStudentById(id);
		if (st.getId()>0) {
			System.out.println("Student Details :");
			System.out.println("ID : "+st.getId());
			System.out.println("Name : "+st.getName());
			System.out.println("Std : "+st.getStd());
			System.out.println("City : "+st.getCity());
		}else {
			System.out.println("Student not found with ID:"+id);
		}
	}

}
