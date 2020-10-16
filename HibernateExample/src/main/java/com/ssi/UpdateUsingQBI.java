package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateUsingQBI {

	public static void main(String[] args) {
		
		
		Configuration config=new Configuration();
		config.configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();

	
		/*
		  // wrong way to update Because
		  
		  Product pr1=new Product(); 		//at this pr1 have[ pcode=0,pname=null,price=0 ]
		  pr1.setPcode(111); 				//here pcode is 111
		   pr1.setPrice(300); 				//here price is 300
		   									//but pname is null
		  
		  try {
		  
		  Transaction tr = session.beginTransaction(); 
		  session.update(pr1); //whenever update method call it takes all parameter
		   						//Hibernate: update Product set pname=?, price=? where pcode=?
		   tr.commit(); session.close();
		  
		  
		  } catch (Exception e) { // TODO: handle exception }
		 */
	
		
	
	  //Right way to update in QBI
	  

		Product pr=(Product) session.get(Product.class, 111);
		pr.setPcode(111);
		pr.setPrice(20);
		
		try {
	
			Transaction tr=session.beginTransaction();
		session.update(pr);
			
			tr.commit();
			session.close();
		
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	  }
	  
	 		
		
		
		
		
		
		
		
		
	}


