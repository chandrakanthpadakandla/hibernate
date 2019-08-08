package com.cgi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.model.Note;
import com.cgi.service.NoteService;

@RestController
public class HelloController {
 
	@Autowired
	private NoteService service;
	
	@GetMapping("/")
	public Note message()
	{
		Note note=new Note();
		note.setNoteId(1);
		note.setNoteTitle("learning java");
		note.setNoteContent("enjoy a lot!!" );
		note.setNoteStatus("active");
		return note;
		
		//return "hello friends!!!";
	}

@PostMapping("/addNote")
public ResponseEntity<Note> addNote(@RequestBody Note note)
{
	service.addNote(note);
	return new ResponseEntity<Note>(note, HttpStatus.CREATED);
}

@GetMapping("/displayNotes")
public ResponseEntity<List<Note>> displayNotes()
{
	List<Note> notes=service.getAllNotes();
	return new ResponseEntity<List<Note>>(notes, HttpStatus.OK);
}
@DeleteMapping("/deleteNote/{id}")
public ResponseEntity<?> deleteNote(@PathVariable("id") int id)
{
	service.deleteNote(id);
	return new ResponseEntity<String>("Deleted",HttpStatus.OK);
}
@PutMapping("/updateNote")
public ResponseEntity<Note> updateNote(@RequestBody Note note)
{
	service.updateNote(note);
	return new ResponseEntity<Note>(note, HttpStatus.OK);

}

@GetMapping("/getNote/{id}")
public ResponseEntity<Note> displayNote(@PathVariable("id") int id)
{
    Note note=service.getNote(id);
    return new ResponseEntity<Note>(note,HttpStatus.OK);
}
}
