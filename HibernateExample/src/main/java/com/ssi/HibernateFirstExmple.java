package com.ssi;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateFirstExmple {

	public static void main(String[] args) {
	
		Configuration config=new Configuration();
		config.configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		
		Student student=new Student();
		student.setContact(1234);
		student.setEmail("pnagarp1@gmail.com");
		student.setName("Pavan nagar");
		student.setPassword("Pnagar@123");
		
		try {
	   Transaction tr=session.beginTransaction();
	   session.save(student);
	   tr.commit();
	   session.close();
	   System.out.print("Data Savesd Success");
	   
		}catch (Exception e) {
			// TODO: handle exception
			
			System.out.print(e);
		}
	}

}
