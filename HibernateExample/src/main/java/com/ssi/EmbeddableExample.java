package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddableExample {

	public static void main(String[] args) {
	
		
		Configuration config=new Configuration();
		config.configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		
		Adress adress=new Adress();
		adress.setHno(101);
		adress.setDistrict("rajgarh");
		adress.setState("MadhyaPradesh");
		Employee emp=new Employee(301, "pavan", adress);
		
		try {
			
			Transaction tr=session.beginTransaction();
			session.save(emp);
			
			tr.commit();
			session.close();
			System.out.println("Data saved");
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
	
		
		

	}

}
