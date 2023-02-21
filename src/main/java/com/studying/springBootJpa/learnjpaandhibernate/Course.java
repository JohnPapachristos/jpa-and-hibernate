package com.studying.springBootJpa.learnjpaandhibernate;

public class Course {
	private long id;
	private String name;
	private String author;
	
	public Course() {
		
	}
	
	public Course(final long id, final String name, final String author) {
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "ID: " + this.id + "\nName: " + this.name + "\nAuthor: " + this.author;
	}
	
}
