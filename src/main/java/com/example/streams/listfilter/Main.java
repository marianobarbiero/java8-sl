package com.example.streams.listfilter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.example.models.Book;

/**
 * streams and lambdas
 *
 */

public class Main {
	public static void main(String[] args) {

		// test lambdas and sum()
		int[] nums = new int[]{1,2,3};
		//System.out.println(Arrays.stream(nums).map(x -> x * 2).sum()); // 12
		
		
		// load data
		Book b1 = new Book("1984","George Orwell", 2);
		Book b2 = new Book("Animal Farm","George Orwell", 3);
		Book b3 = new Book("El Silmarillión","Tolkien", 5);
		
		// test
		List<Book> books = new ArrayList<Book>();
		
		books.add(b1);
		books.add(b2);
		books.add(b3);
		
		List<Book> booksFilter = books.stream()
				.filter(x -> x.getStock() > 3)
				.collect(Collectors.toList());
		
		booksFilter
			.forEach(x -> System.out.format("Name: %s \nStock: %s", x.getName(), x.getStock()));
		
		// Name: El Silmarillión 
		// Stock: 5
		
	}
}
