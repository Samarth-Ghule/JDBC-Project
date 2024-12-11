package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Student;

public class StudentDao {

	String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	String URL = "jdbc:mysql://localhost:3306/jdbc_practice";
	String DB_USER = "root";
	String DB_PASSWORD = "root";

	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rst = null;

	public void openDB() {
		try {
			Class.forName(DB_DRIVER);
			con = DriverManager.getConnection(URL, DB_USER, DB_PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int insertStudent(Student stu) {

		int status = 0;
		String strQuery = "insert into student(name,std,city) values(?,?,?)";
		try {
			openDB();
			pst = con.prepareStatement(strQuery);
			pst.setString(1, stu.getName());
			pst.setInt(2, stu.getStd());
			pst.setString(3, stu.getCity());
			status = pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		return status;
	}
	
	public int updateStudent(Student st) {
		int status = 0;
		String strQuery = "update student set name=?, std=?, city=? where id = ?";
		try {
			openDB();
			pst = con.prepareStatement(strQuery);
			pst.setString(1, st.getName());
			pst.setInt(2, st.getStd());
			pst.setString(3, st.getCity());
			pst.setInt(4, st.getId());
			status = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeDB();
		}
		return status;
	}
	
	public int deleteStudent(int id) {
		String strQuery = "delete from student where id = ?";
		int status = 0;
		try {
			openDB();
			pst = con.prepareStatement(strQuery);
			pst.setInt(1, id);
			status = pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeDB();
		}
		return status;
	}
	
	public List<Student> getAllStudent() {
		String strQuery = "select * from student";
		List<Student> slist = new ArrayList<Student>();
		
		try {
			openDB();
			pst = con.prepareStatement(strQuery);
			rst = pst.executeQuery();
			while(rst.next()) {
				Student st = new Student();
				st.setId(rst.getInt("id"));
				st.setName(rst.getString("name"));
				st.setStd(rst.getInt("std"));
				st.setCity(rst.getString("city"));
				slist.add(st);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeDB();
		}
		return slist;
	}
	
	public Student getStudentById(int id) {
		String strQuery = "select * from student where id=?";
		Student st =  new Student();
		try {
			openDB();
			pst = con.prepareStatement(strQuery);
			pst.setInt(1, id);
			rst = pst.executeQuery();
			while(rst.next()) {
				st.setId(rst.getInt("id"));
				st.setName(rst.getString("name"));
				st.setStd(rst.getInt("std"));
				st.setCity(rst.getString("city"));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeDB();
		}
		return st;
	}

	public void closeDB() {
		try {
			if (con != null) {
				con.close();
			}
			if (pst != null) {
				pst.close();
			}
			if (rst != null) {
				rst.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
