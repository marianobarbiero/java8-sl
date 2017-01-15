package com.example.streams.mapfilter;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import com.example.streams.ex1.Book;

public class Main {

	// create a map of books

	public static void main(String[] args) {
		
		Map<String, Book> books = new HashMap<String, Book>();

		// load data
		Book b1 = new Book("1984", "George Orwell", 1);
		Book b2 = new Book("Animal Farm", "George Orwell", 3);
		Book b3 = new Book("El Silmarillión", "Tolkien", 5);
		Book b4 = new Book("El Silmarillión", "Tolkien", 7);
		
		books.put("b1", b1);
		books.put("b2", b2);
		books.put("b3", b3);
		books.put("b4", b4);
		
		// get books with stock >= 5
		Map<String, Book> resultMap = books.entrySet().stream()
				.filter(x -> x.getValue().getStock() >= 5)
				.collect(Collectors.toMap(e->e.getKey(),e->e.getValue()));
		
		System.out.println(resultMap); // {b3=com.example.streams.ex1.Book@3d075dc0, b4=com.example.streams.ex1.Book@214c265e}
	}

}
