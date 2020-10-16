package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateSecond {

	public static void main(String[] args) {
		
		
		Configuration config=new Configuration();
		config.configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		
		
		Product pr1=new Product(111, "AAA", 300);
		Product pr2=new Product(112, "BBB", 200);
		Product pr3=new Product(113, "CCC", 400);
		Product pr4=new Product(114, "DDD", 600);
		Product pr5=new Product(115, "EEE", 900);
		
		
		try {
			   Transaction tr=session.beginTransaction();
			   session.save(pr1);
			   session.save(pr2);
			   session.save(pr3);
			   session.save(pr4);
			   session.save(pr5);
			   tr.commit();
			   session.close();
			   System.out.print("Data Savesd Success");
			   
				}catch (Exception e) {
					// TODO: handle exception
					
					System.out.print(e);
				}
		
		
	}

}
