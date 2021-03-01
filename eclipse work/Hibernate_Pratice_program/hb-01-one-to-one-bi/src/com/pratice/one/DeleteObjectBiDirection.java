package com.pratice.one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteObjectBiDirection {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class)
				.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			session.beginTransaction();

			int theid = 2;
			/*
			 * InstructorDetail detail = session.get(InstructorDetail.class,
			 * theid); System.out.println("temp Instructor Details" + detail);
			 * System.out.println("the associated instructor " +
			 * detail.getInstructor());
			 * detail.getInstructor().setInstructorDetail(null);
			 * 
			 * session.delete(detail);
			 * 
			 * session.getTransaction().commit(); System.out.println("Done");
			 */
			Instructor instructor = session.get(Instructor.class, theid);
			System.out.println("instructor cals" + instructor);
			System.out.println("the associated instructorDetai Class" + instructor.getInstructorDetail());
			instructor.getInstructorDetail().setInstructor(null);
			session.delete(instructor);
			session.getTransaction().commit();
			System.out.println("Done");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			factory.close();
		}

	}

}
