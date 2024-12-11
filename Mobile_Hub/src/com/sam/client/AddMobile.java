package com.sam.client;

import com.sam.dao.MobileDao;
import com.sam.entity.Mobile;

public class AddMobile {

	public static void main(String[] args) {
		Mobile mb = new Mobile("Iqoo","Z9s","8GB","128GB","19999");
		MobileDao dao = new MobileDao();
		int status = dao.addMobile(mb);
		if (status>0) {
			System.out.println("Mobile Added Successfully...");
		}else {
			System.out.println("Mobile Not Added...");
		}
	}

}
