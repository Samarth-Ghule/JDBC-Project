package com.tka.client;

import java.util.List;

import com.tka.dao.ProductDao;
import com.tka.entity.Product;

public class GetAllProduct {

	public static void main(String[] args) {
		ProductDao dao = new ProductDao();
		List<Product> elist = dao.getAllProduct();
		System.out.println("-------------------------------------");
		for (Product product : elist) {
			System.out.println("ID : "+product.getId());
			System.out.println("Product Name : "+product.getPanme());
			System.out.println("Qty : "+product.getQty());
			System.out.println("Price : "+product.getPrice());
			System.out.println("-------------------------------------");

			
		}
	}

}
