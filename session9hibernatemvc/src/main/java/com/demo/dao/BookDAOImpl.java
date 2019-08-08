package com.demo.dao;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.demo.model.Book;
@Repository
@Transactional
public class BookDAOImpl implements BookDAO{

	  @Autowired
	    private SessionFactory sessionFactory;
	
	    protected Session getSession(){
	        return sessionFactory.getCurrentSession();
	    }
	    
/*	public List<Book> findAllBooks() {
		Session session=getSession();
		             session.cre
		return null;
	}*/

	public void addBook(Book book) {
		Session session=getSession();
		session.persist(book);
	}

}
