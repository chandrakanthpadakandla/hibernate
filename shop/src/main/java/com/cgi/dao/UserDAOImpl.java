package com.cgi.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cgi.model.User;

@Repository
@Transactional
public class UserDAOImpl implements UserDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public boolean validateUser(String username, String password) {
		boolean found = false;
		Session session = sessionFactory.getCurrentSession();
		User user = session.get(User.class, username);
		if (user != null) {
			if (user.getPassword().equals(password)) {
				found = true;

			}
		}
		return found;
	}

}
