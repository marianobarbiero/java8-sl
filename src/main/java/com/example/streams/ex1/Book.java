package com.example.streams.ex1;

public class Book {

	long stock;
	String name;
	String description;
	String author;

	public Book(String name, String author, int stock) {

		this.name = name;
		this.author = author;
		this.stock = stock;

	}

	public long getStock() {
		return stock;
	}

	public void setStock(long stock) {
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

}
