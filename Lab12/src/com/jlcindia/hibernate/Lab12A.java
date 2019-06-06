package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab12A {
	public static void main(String[] args) {
		Transaction tx=null;
		try {
			SessionFactory sf=AHibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			Customer cust=new Customer("satish", "kumar", "sonu@gmail.com", "99310");
			session.save(cust);
			Address add=new Address("mkr", "BGLR", "KTK");
			session.save(add);
			cust.setAdd(add);
			tx.commit();
			session.close();
			System.out.println("Record Inserted");
		} catch (Exception e) {
			if(tx!=null)tx.rollback();
		}
	}

}
