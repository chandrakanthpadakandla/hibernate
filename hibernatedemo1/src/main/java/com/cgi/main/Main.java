package com.cgi.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.cgi.model.Employee;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 // TODO Auto-generated method stub

		 Configuration   configuration=new Configuration().configure();
                 SessionFactory sessionFactory=configuration.buildSessionFactory();
		 Session session=sessionFactory.openSession();
	         Transaction transaction=session.beginTransaction();
	  	 Employee employee=new Employee();
	         employee.setId(1);
	     employee.setName("Akash");
	     employee.setBasic(10000);
	  	  session.save(employee);
         transaction.commit(); 
         session.close();
	}

}