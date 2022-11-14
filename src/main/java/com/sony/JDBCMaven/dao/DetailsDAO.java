package com.sony.JDBCMaven.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sony.JDBCMaven.entity.Details;

public class DetailsDAO {
	
	private SessionFactory factory=null;
	

	public DetailsDAO() {

		Configuration configuration = new Configuration();
		configuration.configure();
	    factory =configuration.buildSessionFactory();
	}
	
	public void getAll() {
		Session session = factory.openSession();
		Details details = session.get(Details.class, 2);
		System.out.println(details);
		
		session.close();
	}
	
	public void save(Details details) {
		Session session = factory.openSession();
	    Transaction transaction  =session.beginTransaction();
		session.save(details);
		System.out.println("data saved");
		transaction.commit();
		session.close();
		
	}
	public void delete () {
		Session session = factory.openSession();
	    Transaction transaction  =session.beginTransaction();
		session.delete(details);
		System.out.println("data deleted");
		transaction.commit();
		session.close();
	}
	public void update() {
		Session session = factory.openSession();
	    Transaction transaction  =session.beginTransaction();
	    Details obj_details= new Details();
	    System.out.println("data updated");
		transaction.commit();
		session.close();
		
	}
	

}
