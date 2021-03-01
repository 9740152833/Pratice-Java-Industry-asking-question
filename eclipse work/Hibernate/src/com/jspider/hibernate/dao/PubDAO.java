package com.jspider.hibernate.dao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.jspider.hibernate.dto.PubDTO;

public class PubDAO {
public void savePub(PubDTO dto) {
		
	 	Configuration conf = new Configuration();
		conf.configure(); 
		
		SessionFactory factory = conf.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();
		
		session.save(dto);
		
		tx.commit();
		
		
		System.out.println(dto.getPubName() + " saved successfully");
	}

}
