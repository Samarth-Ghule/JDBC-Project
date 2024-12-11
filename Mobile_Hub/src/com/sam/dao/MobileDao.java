package com.sam.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.sam.entity.Mobile;

public class MobileDao {
	String Driver = "com.mysql.cj.jdbc.Driver";
	String URL = "jdbc:mysql://localhost:3306/jdbc_practice";
	String User = "root";
	String Password = "root";

	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rst = null;

	public void openDB() {
		try {
			Class.forName(Driver);
			con = DriverManager.getConnection(URL, User, Password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int addMobile(Mobile mb) {
		String query = "insert into mobile(brand,model,ram,storage,price)values(?,?,?,?,?)";
		int status = 0;
		try {
			openDB();
			pst = con.prepareStatement(query);
			pst.setString(1, mb.getBrand());
			pst.setString(2, mb.getModel());
			pst.setString(3, mb.getRam());
			pst.setString(4, mb.getStorage());
			pst.setString(5, mb.getPrice());
			status = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		return status;
	}

	public int updateMobile(Mobile mb) {
		String query = "update mobile set model=?,ram=?,storage=?,price=? where id=?";
		int status = 0;
		try {
			openDB();
			pst = con.prepareStatement(query);
			pst.setString(1, mb.getModel());
			pst.setString(2, mb.getRam());
			pst.setString(3, mb.getStorage());
			pst.setString(4, mb.getPrice());
			pst.setInt(5, mb.getMobileId());
			status = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		return status;
	}

	public int deleteMobile(int mobileId) {
		String query = "delete from mobile where id = ?";
		int status = 0;
		try {
			openDB();
			pst = con.prepareStatement(query);
			pst.setInt(1, mobileId);
			status = pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		return status;
	}

	public List<Mobile> getAllMobile() {
		String query = "select * from mobile";
		List<Mobile> mlist = new ArrayList<Mobile>();
		try {
			openDB();
			pst = con.prepareStatement(query);
			rst = pst.executeQuery();

			while (rst.next()) {
				Mobile mb = new Mobile();
				mb.setMobileId(rst.getInt("mobileId"));
				mb.setBrand(rst.getString("brand"));
				mb.setModel(rst.getString("model"));
				mb.setRam(rst.getString("ram"));
				mb.setStorage(rst.getString("storage"));
				mb.setPrice(rst.getString("price"));
				mlist.add(mb);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeDB();
		}
		return mlist;
	}
	
	public Mobile getMobileById(int mobileId) {
		String query = "select * from mobile where mobileId=?";
		Mobile mb = new Mobile();
		try {
			openDB();
			pst = con.prepareStatement(query);
			pst.setInt(1, mobileId);
			rst = pst.executeQuery();
			while(rst.next()) {
				mb.setMobileId(rst.getInt("mobileId"));
				mb.setBrand(rst.getString("brand"));
				mb.setModel(rst.getString("model"));
				mb.setRam(rst.getString("ram"));
				mb.setStorage(rst.getString("storage"));
				mb.setPrice(rst.getString("price"));
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			closeDB();
		}
		return mb;
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
