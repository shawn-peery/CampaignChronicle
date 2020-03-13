package com.exitium.campaignchronicle.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="notes")
public class Note {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="description")
	private String description;
	
	@Column(name="author")
	private String author;
	
	@Column(name="general_knowledge")
	private boolean generalKnowledge;
	
	public Note() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isGeneralKnowledge() {
		return generalKnowledge;
	}

	public void setGeneralKnowledge(boolean generalKnowledge) {
		this.generalKnowledge = generalKnowledge;
	}

	@Override
	public String toString() {
		return "Note [id=" + id + ", title=" + title + ", description=" + description + ", author=" + author
				+ ", generalKnowledge=" + generalKnowledge + "]";
	}
}
