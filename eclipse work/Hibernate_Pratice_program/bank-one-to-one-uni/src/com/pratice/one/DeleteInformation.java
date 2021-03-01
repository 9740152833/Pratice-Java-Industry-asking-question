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

			int id = 1;
			session.beginTransaction();
			Bank bank = session.get(Bank.class, id);

			System.out.println("Bank information only " + bank);

			System.out.println("Owner Information only " + bank.getOwner());

			session.delete(bank);

			session.getTransaction().commit();
			System.out.println("Done");

		} finally {
			factory.close();
		}

	}

}
