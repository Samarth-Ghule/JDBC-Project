package com.tka.client;

import com.tka.dao.ProductDao;
import com.tka.entity.Product;


public class GetProductById {
	public static void main(String[] args) {
		ProductDao dao = new ProductDao();
		int id = 20;
		Product pro = dao.getProductById(id);
		if (pro.getId() > 0 ) {
			System.out.println("Product Details :");
			System.out.println("ID : "+pro.getId());
			System.out.println("Product Name : "+pro.getPanme());
			System.out.println("Qty : "+pro.getQty());
			System.out.println("Price : "+pro.getPrice());
		}else {
			System.out.println("Product Not found with Id:"+id);
		}
		
	}

}
