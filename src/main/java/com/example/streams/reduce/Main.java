package com.example.streams.reduce;

import java.util.ArrayList;
import java.util.List;

import com.example.models.Person;

public class Main {
	
	public static void main(String[] args) {
		
		List<Person> people = new ArrayList<>();
		
		Person p1 = new Person("x","xx",20);
		Person p2 = new Person("y","yy",30);
		Person p3 = new Person("z","zz",40);
		
		people.add(p1);
		people.add(p2);
		people.add(p3);
		
		Integer total = people.stream()
			//.filter(p -> p.getAge() > 100)
			.map(Person::getAge)
			.reduce(0, (a,b) -> a + b);
		
		System.out.format("total: %s", total); // total: 90
		
	}
	
}
