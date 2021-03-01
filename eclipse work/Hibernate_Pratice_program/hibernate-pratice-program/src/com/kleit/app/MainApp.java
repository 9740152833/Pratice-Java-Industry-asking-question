package com.kleit.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
														.addAnnotatedClass(Student.class)
														.buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		try{
			Student  s = new Student("hello", "roand", "akashronad48@gmail.com");
			session.beginTransaction();
			System.out.println("saving the object");
			session.save(s);
			session.getTransaction().commit();
			System.out.println("Done!");
			
			
		}finally {
			factory.close();
		}

	}

}
