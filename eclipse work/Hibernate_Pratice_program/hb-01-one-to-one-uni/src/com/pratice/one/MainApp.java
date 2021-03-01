package com.pratice.one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			Instructor instructor = new Instructor("akash", "ronad", "akashronad48@gamil.com");
			InstructorDetail detail = new InstructorDetail("akash123.com", "lovecoding");
			instructor.setInstructorDetail(detail);
			session.beginTransaction();
			session.save(instructor);

			session.getTransaction().commit();
			System.out.println("Done");

		} finally {
			factory.close();
		}

	}

}
