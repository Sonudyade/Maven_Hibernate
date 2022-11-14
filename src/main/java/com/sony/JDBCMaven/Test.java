package com.sony.JDBCMaven;

import com.sony.JDBCMaven.dao.DetailsDAO;
import com.sony.JDBCMaven.entity.Details;

public class Test {
	public static void main(String[] args) {
		
		DetailsDAO dao = new DetailsDAO();
		dao.getAll();
		
		Details details = new Details();
		details.setId(3);
		details.setName("Nisha");
		details.setEmail("nisha123@gmail.com");
		
		dao.save(details);
		dao.delete();
		
		
		Details d= new Details();
		d.setId(2);
		d.setName("Sony");
		d.setEmail("sony123@gmail.com");
		dao.update();
	}

}
