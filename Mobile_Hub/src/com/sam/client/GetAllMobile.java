package com.sam.client;

import java.util.List;

import com.sam.dao.MobileDao;
import com.sam.entity.Mobile;

public class GetAllMobile {
	public static void main(String[] args) {
		MobileDao dao = new  MobileDao();
		List<Mobile> mlist = dao.getAllMobile();
		System.out.println("-----------------------------------");
		for (Mobile m : mlist) {
			System.out.println("Mobile Id : "+m.getMobileId());
			System.out.println("Brand : "+m.getBrand());
			System.out.println("Model : "+m.getModel());
			System.out.println("Ram : "+m.getRam());
			System.out.println("Storage : "+m.getStorage());
			System.out.println("Price : "+m.getPrice());
			System.out.println("-----------------------------------");
		}
		
	}

}
