package com.tka.client;

import com.tka.dao.ProductDao;

public class DeleteProduct {
	public static void main(String[] args) {
		ProductDao dao = new ProductDao();
		int status = dao.deleteProduct(1);
		if (status > 0) {
			System.out.println("Product Deleted...");
		}else {
			System.out.println("Product Not Deleted...");
		}
	}

}
