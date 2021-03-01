package com.kleit.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();
		try {
			Student s = new Student("hp", "ambrica", "hp@gmail.com");
			Student s1 = new Student("dell", "us", "dell48@gmail.com");
			Student s2 = new Student("lenovo", "china", "lenovo48@gmail.com");
			session.beginTransaction();
			System.out.println("saving the object");
			session.save(s);
			session.save(s1);
			session.save(s2);
			session.getTransaction().commit();
			System.out.println("Done!");

		} finally {
			factory.close();
		}

	}

}
