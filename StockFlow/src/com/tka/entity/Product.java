package com.tka.entity;

public class Product {
	int id;
	String panme;
	int qty;
	int price;

	public Product() {
		super();
	}

	public Product(String panme, int qty, int price) {
		super();
		this.panme = panme;
		this.qty = qty;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPanme() {
		return panme;
	}

	public void setPanme(String panme) {
		this.panme = panme;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", panme=" + panme + ", qty=" + qty + ", price=" + price + "]";
	}

}
