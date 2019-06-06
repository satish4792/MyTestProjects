package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab11A {
	public static void main(String[] args) {
		Transaction tx=null;
		try {
			SessionFactory sf=CHibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			
			Customer cust=new Customer("Satish", "Kumar", "sonu@gmail.com", "993010");
			session.save(cust);
			Address add=new Address("mathikere", "Blore", "KTK");
			
			session.save(add);
			cust.setAdd(add);
			tx.commit();
			session.close();
			System.out.println("Record Inserted");
		} catch (Exception e) {
			e.printStackTrace();
			if(tx!=null)tx.rollback();
		}
	}

}
