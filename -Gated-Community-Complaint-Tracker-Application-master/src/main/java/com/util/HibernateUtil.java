package com.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.NewComplaint;
import com.model.RegisterData;

public class HibernateUtil {
  
	private static SessionFactory sessionFact = null;
	
	public static SessionFactory getSessionFactory() {
		
		if(sessionFact == null) {
			 Configuration cfg = new Configuration();
			 cfg.configure("hibernate.cfg.xml");
			 cfg.addAnnotatedClass(RegisterData.class);
			 cfg.addAnnotatedClass(NewComplaint.class);
			 sessionFact =  cfg.buildSessionFactory();
			 return sessionFact;
		}
       return sessionFact;
	}
	
}
