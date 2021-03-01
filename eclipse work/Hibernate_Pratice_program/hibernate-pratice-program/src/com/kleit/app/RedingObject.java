package com.kleit.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class RedingObject {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {
			/*
			 * Student s = new Student("dell", "roand",
			 * "akashronad48@gmail.com"); session.beginTransaction();
			 * System.out.println("saving the object"); System.out.println(s);
			 * session.save(s); session.getTransaction().commit();
			 */

			// retrive object

			session = factory.getCurrentSession();
			session.beginTransaction();
			// Student myStudent = session.get(Student.class, 2);
			List<Student> list = session.createQuery("from Student ").list();
			displyStudents(list);
			// System.out.println("complete " + myStudent.getEmail());
			list = session.createQuery("from Student  s where s.firstName = 'dell' ").list();
			displyStudents(list);
			session.getTransaction().commit();

			System.out.println("Done!");

		} finally {
			factory.close();
		}

	}

	private static void displyStudents(List<Student> list) {
		for (Student studentlist : list) {
			System.out.println(studentlist);

		}
	}
}
