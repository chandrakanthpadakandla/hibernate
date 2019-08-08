package com.cgi.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.cgi.model.Customer;
import com.cgi.model.User;
import com.cgi.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerService service;

	@GetMapping("/addcustomer")
public String addCustomer(HttpSession session,@ModelAttribute Customer customer )	
{
		String username=session.getAttribute("username").toString();
		String view;
		if(username!=null)
		{
			service.addCustomer(customer);
			view="customersuccess";
		}
		else
		{
			view="login";
		}

        return view;
}


}
