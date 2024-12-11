package com.tka.client;

import com.tka.dao.StudentDao;

public class DeleteStudent {
	public static void main(String[] args) {
		StudentDao dao = new StudentDao();
		int status = dao.deleteStudent(1);
		if (status > 0) {
			System.out.println("Student Deleted...");
		}else {
			System.out.println("Student not Deleted..");
		}
	}

}
