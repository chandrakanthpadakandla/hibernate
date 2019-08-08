package com.cgi.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/*
 * The class "Note" will be acting as the data model for the note Table in the database. Please
 * note that this class is annotated with @Entity annotation. Hibernate will scan all package for 
 * any Java objects annotated with the @Entity annotation. If it finds any, then it will begin the 
 * process of looking through that particular Java object to recreate it as a table in your database.
 */
@Entity
public class Note {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int noteId;

	private String noteTitle;
	private String noteContent;
	private String noteStatus;
	private LocalDateTime createdAt;

	public Note() {

	}


	public Note(int noteId, String noteTitle, String noteContent, String noteStatus, LocalDateTime createdAt) {
		super();
		this.noteId = noteId;
		this.noteTitle = noteTitle;
		this.noteContent = noteContent;
		this.noteStatus = noteStatus;
		this.createdAt = createdAt;
	}


	public int getNoteId() {
		return noteId;
	}


	public void setNoteId(int noteId) {
		this.noteId = noteId;
	}


	public String getNoteTitle() {
		return noteTitle;
	}


	public void setNoteTitle(String noteTitle) {
		this.noteTitle = noteTitle;
	}


	public String getNoteContent() {
		return noteContent;
	}


	public void setNoteContent(String noteContent) {
		this.noteContent = noteContent;
	}


	public String getNoteStatus() {
		return noteStatus;
	}


	public void setNoteStatus(String noteStatus) {
		this.noteStatus = noteStatus;
	}


	public LocalDateTime getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}


	@Override
	public String toString() {
		return "Note [noteId=" + noteId + ", noteTitle=" + noteTitle + ", noteContent=" + noteContent + ", noteStatus="
				+ noteStatus + ", createdAt=" + createdAt + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((createdAt == null) ? 0 : createdAt.hashCode());
		result = prime * result + ((noteContent == null) ? 0 : noteContent.hashCode());
		result = prime * result + noteId;
		result = prime * result + ((noteStatus == null) ? 0 : noteStatus.hashCode());
		result = prime * result + ((noteTitle == null) ? 0 : noteTitle.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Note other = (Note) obj;
		if (createdAt == null) {
			if (other.createdAt != null)
				return false;
		} else if (!createdAt.equals(other.createdAt))
			return false;
		if (noteContent == null) {
			if (other.noteContent != null)
				return false;
		} else if (!noteContent.equals(other.noteContent))
			return false;
		if (noteId != other.noteId)
			return false;
		if (noteStatus == null) {
			if (other.noteStatus != null)
				return false;
		} else if (!noteStatus.equals(other.noteStatus))
			return false;
		if (noteTitle == null) {
			if (other.noteTitle != null)
				return false;
		} else if (!noteTitle.equals(other.noteTitle))
			return false;
		return true;
	}

}
	