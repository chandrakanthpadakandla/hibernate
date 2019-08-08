package com.cgi.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cgi.model.Note;

@Repository
@Transactional
public class NoteDAOImpl implements NoteDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void addNote(Note note) {
		Session session = sessionFactory.getCurrentSession();
		session.save(note);
	}

	public void deleteNote(int id) {
		Note note = getNote(id);
		Session session = sessionFactory.getCurrentSession();
		session.delete(note);

	}

	public void updateNote(Note note) {
		Session session = sessionFactory.getCurrentSession();
		session.update(note);
	}

	public List<Note> getAllNotes() {
		String HQLQuery = "FROM Note n ORDER BY n.createdAt DESC";
		Session session = sessionFactory.getCurrentSession();
		List<Note> noteList = session.createQuery(HQLQuery).list();
		return noteList;

	}

	public Note getNote(int id) {
		Session session = sessionFactory.getCurrentSession();
		Note note = session.get(Note.class, id);
		return note;
	}

}
