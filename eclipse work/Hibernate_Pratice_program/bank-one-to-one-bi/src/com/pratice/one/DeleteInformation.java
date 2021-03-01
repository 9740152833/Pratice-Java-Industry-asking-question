package com.pratice.one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DeleteInformation {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Bank.class)
				.addAnnotatedClass(Owner.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			int id = 2;
			session.beginTransaction();
			Owner owner = session.get(Owner.class, id);
			System.out.println("Bank information only " + owner.getBank());

			System.out.println("Owner Information only " + owner);

			owner.getBank().setOwner(null);

			session.delete(owner);

			session.getTransaction().commit();
			System.out.println("Done");

		} finally {
			factory.close();
		}

	}

}
