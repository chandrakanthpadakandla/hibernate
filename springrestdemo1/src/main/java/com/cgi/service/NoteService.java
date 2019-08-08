package com.cgi.service;

import java.util.List;

import com.cgi.model.Note;

public interface NoteService {
     
	public void addNote(Note note);
    public void deleteNote(int id);
    public void updateNote(Note note);
    public List<Note> getAllNotes();
    public Note getNote(int id);
}
