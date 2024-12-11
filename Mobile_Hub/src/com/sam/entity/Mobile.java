package com.sam.entity;

public class Mobile {
	
	private int mobileId;
	private String brand;
	private String model;
	private String ram;
	private String storage;
	private String price;
	
	public Mobile() {
		super();
	}

	public Mobile(String brand, String model, String ram, String storage, String price) {
		super();
		this.brand = brand;
		this.model = model;
		this.ram = ram;
		this.storage = storage;
		this.price = price;
	}

	public int getMobileId() {
		return mobileId;
	}

	public void setMobileId(int mobileId) {
		this.mobileId = mobileId;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRam() {
		return ram;
	}

	public void setRam(String ram) {
		this.ram = ram;
	}

	public String getStorage() {
		return storage;
	}

	public void setStorage(String storage) {
		this.storage = storage;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Mobile [mobileId=" + mobileId + ", brand=" + brand + ", model=" + model + ", ram=" + ram + ", storage="
				+ storage + ", price=" + price + "]";
	}
	
	
	
	
}
