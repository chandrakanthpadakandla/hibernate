package com.cgi.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cgi.model.Student;

@Repository
@Transactional
public class StudentDAO {

	@Autowired
	SessionFactory sessionFactory;

public StudentDAO() {
	super();
	// TODO Auto-generated constructor stub
}

public StudentDAO(SessionFactory sessionFactory) {
	super();
	this.sessionFactory = sessionFactory;
}

public SessionFactory getSessionFactory() {
	return sessionFactory;
}

public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
}
	public void saveStudent(Student student) {
	Session session=sessionFactory.getCurrentSession();
	
	}
	
}
