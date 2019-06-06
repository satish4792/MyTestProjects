package com.jlcindia.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Lab6A {
	public static void main(String[] args) {
		Transaction tx = null;
		try {
			SessionFactory sf = AHibernateUtil.getSessionFactory();
			Session session = sf.openSession();
			tx = session.beginTransaction();
			// 1. Adding the Student
			Student stu = new Student("bangalore", "satish", "active", 17000.0);
			Integer it = (Integer) session.save(stu);
			System.out.println(it.intValue());

	/*		// 2. Adding the CurrentStudent
			CurrentStudent cstu = new CurrentStudent("banaglore", "sonu",
					"active", 17000.0, 7000.0, "7.AM-9.PM", "MKR");
			it = (Integer) session.save(cstu);
			System.out.println(it.intValue());

			// 3. Adding the OldStudent
			OldStudent ostu = new OldStudent("bangalore", "suman", "active",
					18000.0, "CTS", "suman@cts", 40000.0);
			it = (Integer) session.save(ostu);
			System.out.println(it.intValue());

			// 4. Adding the WeekdaysStudent
			WeekdayStudent wstu = new WeekdayStudent("Delhi", "Kumar",
					"active", 20000.0, 12000.0, "6.30-8.30AM", "BTM", "B.tech",
					"70%", 2016);
			it = (Integer) session.save(wstu);
			System.out.println(it.intValue());

			// 5. Adding the WeekendStudent
			WeekendStudent westu = new WeekendStudent("Pune", "Patil",
					"active", 18000.0, 6000.0, "5PM-7PM", "MHA", "mindtree",
					"patil@mtree", 65000.0);
			it = (Integer) session.save(westu);
			System.out.println(it.intValue());
*/			System.out.println("query inserted");
			tx.commit();
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
			if(tx!=null) tx.rollback();
		}
	}

}
