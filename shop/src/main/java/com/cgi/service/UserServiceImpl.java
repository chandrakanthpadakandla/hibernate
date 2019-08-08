package com.cgi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.dao.UserDAO;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO dao;

	public boolean validateUser(String username, String password) {
		boolean found = dao.validateUser(username, password);
		return found;
	}

}
