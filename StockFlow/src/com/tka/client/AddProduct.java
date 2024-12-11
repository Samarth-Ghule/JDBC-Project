package com.tka.client;

import com.tka.dao.ProductDao;
import com.tka.entity.Product;

public class AddProduct {

	public static void main(String[] args) {
		Product pro = new Product("Godrej", 320, 10);
		ProductDao dao = new ProductDao();
		int status = dao.addProduct(pro);
		if (status > 0) {
			System.out.println("Product Inserted...");
		}else {
			System.out.println("Product Not Inserted...");
		}
	}
}
