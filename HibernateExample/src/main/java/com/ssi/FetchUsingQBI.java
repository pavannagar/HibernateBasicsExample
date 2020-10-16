package com.ssi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchUsingQBI {

	public static void main(String[] args) {
		
		
		
		Configuration config=new Configuration();
		config.configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		
		//get object of employee class it contain all column which id 301
		Employee emp=(Employee) session.get(Employee.class, 301);
		
		//get object of Product class it contain all column which id 111
		Product pr1=(Product) session.get(Product.class, 111);
		Product pr2=(Product) session.get(Product.class, 112);
		Product pr3=(Product) session.get(Product.class, 113);
		Product pr4=(Product) session.get(Product.class, 114);
		Product pr5=(Product) session.get(Product.class, 115);
		
		/*
		 * int eno=emp.getEno(); String ename=emp.getEname(); Adress
		 * adress=emp.getAdress(); adress.getHno(); adress.getDistrict();
		 * adress.getState();
		 */
		//dont need to fetch each and disply...by toString method 
		//it automaticalyy arrange in a string formate
		System.out.println(emp);
		System.out.println("-----------------------------------------");
		System.out.println(pr1);
		System.out.println(pr2);
		System.out.println(pr3);
		System.out.println(pr4);
		System.out.println(pr5);
		
		session.close();
		
		/*
		 
		 Using QBI we can fetch only one row at a time 
		 this one row is fetched By Id
		 
		 */
		
		
		
		
		
		
	}

}
