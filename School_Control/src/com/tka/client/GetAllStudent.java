package com.tka.client;

import java.util.List;

import com.tka.dao.StudentDao;
import com.tka.entity.Student;

public class GetAllStudent {
	public static void main(String[] args) {
		StudentDao dao = new StudentDao();
		List<Student> slist = dao.getAllStudent();
		for (Student student : slist) {
			System.out.println(student);
		}
	}

}
