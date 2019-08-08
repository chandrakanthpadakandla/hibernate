package com.cgi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.dao.NoteDAO;
import com.cgi.model.Note;


@Service
public class NoteServiceImpl implements NoteService {

	
	@Autowired
	private NoteDAO dao;
	
	public void addNote(Note note) {
		// TODO Auto-generated method stub
		dao.addNote(note);
	}

	public void deleteNote(int id) {
		dao.deleteNote(id);
		// TODO Auto-generated method stub

	}

	public void updateNote(Note note) {
		dao.updateNote(note);
		// TODO Auto-generated method stub

	}

	public List<Note> getAllNotes() {
	      List<Note> noteList=dao.getAllNotes();
	        return noteList;
	}

	public Note getNote(int id) {
        Note note=dao.getNote(id);
    return note;
}


}
