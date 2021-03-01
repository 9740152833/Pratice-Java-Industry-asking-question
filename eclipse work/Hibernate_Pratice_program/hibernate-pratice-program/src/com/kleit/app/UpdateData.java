package com.kleit.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateData {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			System.out.println("updating the object");
			int studentid = 2;
			session = factory.getCurrentSession();
			session.beginTransaction();
			Student s = session.get(Student.class, studentid);
			s.setFirstName("suresh");
			session.getTransaction().commit();
			
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			 session.createQuery("update Student set email  = 'foo@gmail.com' ") .executeUpdate();
			session.getTransaction().commit();
			
			
			session = factory.getCurrentSession();
			session.beginTransaction();
			 session.createQuery("update Student s set s.email  = 'zoo@gmail.com'  where s.firstName='hp' ") .executeUpdate();
			session.getTransaction().commit();
			
			
			System.out.println("Done!");

		} finally {
			factory.close();
		}

	}

}
