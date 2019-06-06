package hibernate.practice;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class ClientInsert {
	public static void main(String[] args) {
		Transaction tx=null;
		try {
			SessionFactory sf=CHibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			User user=new User("satish", "satish@gmail.com");
			session.save(user);
			/*Profile p1=new Profile("JAVA", "3 years");
			session.save(p1);
			user.setProfiles(p1);
			p1.setUser(user);
			*/
			
			Address add1=new Address("MKR", "BLR", "KA");
			session.save(add1);
			
			Address add2=new Address("MHA", "BLR", "KA");
			session.save(add2);

			Address add3=new Address("BTM", "BLR", "KA");
			session.save(add3);
			
			add1.setUser(user);
			add2.setUser(user);
			add3.setUser(user);
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			if(tx!=null)tx.rollback();
		}
	}

}
