package com.sam.client;

import com.sam.dao.MobileDao;
import com.sam.entity.Mobile;

public class UpdateMobile {

	public static void main(String[] args) {
		Mobile mb = new Mobile();
		mb.setModel("V30");
		mb.setRam("12GB");
		mb.setStorage("256GB");
		mb.setPrice("29999");
		mb.setMobileId(1);
		MobileDao dao = new MobileDao();
		int status = dao.updateMobile(mb);
		if (status > 0) {
			System.out.println("Mobile Updated...");
		}else {
			System.out.println("Mobile Not Updated...");
		}

	}

}
