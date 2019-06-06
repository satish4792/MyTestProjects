package com.jlcindia.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class AHibernateUtil {
	public static SessionFactory factory=null;
	
	static{
		
		try {
			AnnotationConfiguration cfg=new AnnotationConfiguration();
			cfg=(AnnotationConfiguration)cfg.configure();
			factory=cfg.buildSessionFactory();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static SessionFactory getSessionFactory(){
		return factory;
	}
	
}
