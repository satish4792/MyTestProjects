package com.jlcindia.hibernate;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab16A {
	
	static{
		System.out.println("Before log4j configuration");
		DOMConfigurator.configure("log4j.xml");
		System.out.println("After log4j configuration");
	}
	
	private static Logger logger = Logger.getLogger(Lab16A.class);
	public static void main(String[] args) {
		
		Transaction tx=null;
		
		
		try {
			SessionFactory sf=AHibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			Customer cust=new Customer("satish", "kumar", "sk@gmail.com", 9141727949L);
			session.save(cust);
			Request req1=new Request("15/01/2018", "item_dry", "good condition");
			Request req2=new Request("05/01/2018", "item_normal", "use before 10");
			session.save(req1);session.save(req2);
			req1.setCustomer(cust);req2.setCustomer(cust);
			tx.commit();
			session.close();
			logger.info("DONE");
		} catch (Exception e) {
			e.printStackTrace();
			if(tx!=null)tx.rollback();
		}
	}

}
