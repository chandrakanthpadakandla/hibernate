package com.cgi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.dao.CustomerDAO;
import com.cgi.model.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {
   
	@Autowired
   private  CustomerDAO dao;
   public void addCustomer(Customer customer)
   {
        dao.addCustomer(customer);
}
}
