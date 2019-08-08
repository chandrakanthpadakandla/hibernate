package com.cgi.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cgi.model.Customer;

@Repository
@Transactional
public class CustomerDAOImpl implements CustomerDAO{
	
	@Autowired
	private SessionFactory sessionFactory;
	 
    public void addCustomer(Customer customer)
     {
             Session session=sessionFactory.getCurrentSession();
             session.save(customer);

}
}
