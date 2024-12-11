package com.tka.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.tka.entity.Product;

public class ProductDao {

	String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
	String DB_URL = "jdbc:mysql://localhost:3306/jdbc_practice";
	String DB_USER = "root";
	String DB_PASSWORD = "root";

	Connection con = null;
	PreparedStatement pst = null;
	ResultSet rst = null;

	public void openDB() {
		try {
			Class.forName(DB_DRIVER);
			con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int addProduct(Product pro) {

		int status = 0;
		String strQuery = "insert into product(pname,qty,price) values(?,?,?)";
		try {
			openDB();
			pst = con.prepareStatement(strQuery);
			pst.setString(1, pro.getPanme());
			pst.setInt(2, pro.getQty());
			pst.setInt(3, pro.getPrice());
			status = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		return status;
	}

	public int updateProduct(Product pro) {

		String strQuery = "update product set pname = ?, qty = ?, price = ? where id = ? ";
		int status = 0;
		try {
			openDB();
			pst = con.prepareStatement(strQuery);
			pst.setString(1, pro.getPanme());
			pst.setInt(2, pro.getQty());
			pst.setInt(3, pro.getPrice());
			pst.setInt(4, pro.getId());
			status = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		return status;
	}

	public int deleteProduct(int id) {
		String strQuery = "delete from product where id = ?";
		int status = 0;
		try {
			openDB();
			pst = con.prepareStatement(strQuery);
			pst.setInt(1, id);
			status = pst.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		return status;
	}

	public List<Product> getAllProduct() {
		String strQuery = "select *from product";
		List<Product> elist = new ArrayList<Product>();
		try {
			openDB();
			pst = con.prepareStatement(strQuery);
			rst = pst.executeQuery();
			while (rst.next()) {
				Product pro = new Product();
				pro.setId(rst.getInt("id"));
				pro.setPanme(rst.getString("pname"));
				pro.setQty(rst.getInt("qty"));
				pro.setPrice(rst.getInt("price"));
				elist.add(pro);

			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		return elist;
	}

	public Product getProductById(int id) {
		String strQuery = "select * from product where id=? ";
		Product pro = new Product();
		try {
			openDB();
			pst = con.prepareStatement(strQuery);
			pst.setInt(1, id);
			rst = pst.executeQuery();
			while (rst.next()) {
			
				pro.setId(rst.getInt("id"));
				pro.setPanme(rst.getString("pname"));
				pro.setQty(rst.getInt("qty"));
				pro.setPrice(rst.getInt("price"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		return pro;
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
