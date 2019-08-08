package com.cgi.dao;

import java.util.List;

import com.cgi.model.Note;

public interface NoteDAO {
	public void addNote(Note note);

	public void deleteNote(int id);

	public void updateNote(Note note);

	public List<Note> getAllNotes();

	public Note getNote(int id);
}
