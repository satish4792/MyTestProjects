package com.jlcindia.hibernate;

import org.hibernate.*;

public class Lab6B {
	public static void main(String[] args) {

		Transaction tx=null;
		try {
			SessionFactory sf=AHibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			Student st=(Student)session.load(Student.class, 1);
			System.out.println(st);
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			if(tx!=null)tx.rollback();
		}
	}
}
