package com.sam.client;

import com.sam.dao.MobileDao;
import com.sam.entity.Mobile;

public class GetMobileById {

	public static void main(String[] args) {
		MobileDao dao = new MobileDao();
		int mobileId = 85;
		Mobile m = dao.getMobileById(mobileId);
		if (m.getMobileId() > 0) {
			System.out.println("Mobile Id : "+m.getMobileId());
			System.out.println("Brand : "+m.getBrand());
			System.out.println("Model : "+m.getModel());
			System.out.println("Ram : "+m.getRam());
			System.out.println("Storage : "+m.getStorage());
			System.out.println("Price : "+m.getPrice());
		}else {
			System.out.println("Mobile Not found with Id:"+mobileId);
		}

	}

}
