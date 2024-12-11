package com.tka.client;

import com.tka.dao.ProductDao;
import com.tka.entity.Product;

public class UpdateProduct {
	public static void main(String[] args) {
		Product pro = new Product();
		pro.setPanme("Parle-G");
		pro.setQty(500);
		pro.setPrice(10);
		pro.setId(2);
		ProductDao dao = new ProductDao();
		int status = dao.updateProduct(pro);
		if (status > 0) {
			System.out.println("Product Updated...");
		}else {
			System.out.println("Product Not Updated...");
		}
	}
}
