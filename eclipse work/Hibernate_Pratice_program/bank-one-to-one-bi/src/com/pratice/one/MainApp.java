package com.pratice.one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainApp {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Bank.class)
				.addAnnotatedClass(Owner.class).buildSessionFactory();

		Session session = factory.getCurrentSession();

		try {

			Bank bank = new Bank("saving ", "10-06-2005");
			Owner owner = new Owner("akash", "10-12-1996", "54000234501");
			bank.setOwner(owner);
			session.beginTransaction();
			session.save(bank);
			

			session.getTransaction().commit();
			System.out.println("Done");

		} finally {
			factory.close();
		}

	}

}
