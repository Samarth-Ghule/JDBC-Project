package com.tka.entity;

public class Student {

	int id;
	String name;
	int std;
	String city;

	public Student() {
		super();
	}

	public Student(String name, int std, String city) {
		super();
		this.name = name;
		this.std = std;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStd() {
		return std;
	}

	public void setStd(int std) {
		this.std = std;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", std=" + std + ", city=" + city + "]";
	}

}
