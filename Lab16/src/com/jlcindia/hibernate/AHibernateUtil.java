package com.jlcindia.hibernate;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class AHibernateUtil {

	static SessionFactory factory;
	private static Logger logger = Logger.getLogger(AHibernateUtil.class);
	static {
		try {
			AnnotationConfiguration cfg = new AnnotationConfiguration();
			cfg = (AnnotationConfiguration)cfg.configure();
			logger.info("SessionFactory Object created");
			factory = cfg.buildSessionFactory();
			

		} catch (Exception e) {
			e.printStackTrace();
			logger.info("error while creating sessionFactory");
		}

	}

	public static SessionFactory getSessionFactory() {
		return factory;
	}

}
