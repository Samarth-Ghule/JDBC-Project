package com.sam.client;

import com.sam.dao.MobileDao;

public class DeleteMobile {
	public static void main(String[] args) {
		MobileDao dao = new MobileDao();
		int status = dao.deleteMobile(1);
		if (status > 0 ) {
			System.out.println("Mobile Deleted...");
		}else {
			System.out.println("Mobile not Deleted...");
		}
	}

}
