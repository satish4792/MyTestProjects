package hibernate.practice;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HqlOutput {
	public static void main(String[] args) {
		Transaction tx=null;
		try {
			SessionFactory sf=CHibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			tx=session.beginTransaction();
			//User user=(User)session.load(User.class,1);
			//System.out.println("User Info ********");
			//System.out.println(user);
			String hql="select add  from Address add join add.user user";
			//String hql="select user.uname from User user  join Address add  where user.uid=add.uid";
			Query q=session.createQuery(hql);
			List<User> list=q.list();
			//q.executeUpate();
			//System.out.println(list);
			Iterator it=list.iterator();
			while(it.hasNext()){
				System.out.println(it.next());
			}
			tx.commit();
			session.close();
		} catch (Exception e) {
			e.printStackTrace();
			if(tx!=null) tx.rollback();
		}
	}

}
