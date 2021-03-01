package com.kleit.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteObject {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			System.out.println("deleting the object");
			int studentid = 4;
			session = factory.getCurrentSession();
			session.beginTransaction();
			Student s = session.get(Student.class, studentid);
			session.delete(s);
			session.createQuery("delete from Student where id = 3").executeUpdate();
			session.getTransaction().commit();

			System.out.println("Done!");

		} finally {
			factory.close();
		}

	}

}
