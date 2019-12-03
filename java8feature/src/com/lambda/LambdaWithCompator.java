package com.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaWithCompator {

	public static void main(String[] args) {

		List<Product> prodList = new ArrayList<Product>();

		// Adding Products
		prodList.add(new Product(1, "CCCCCCC", 250f));
		prodList.add(new Product(3, "AAAAAA", 300f));
		prodList.add(new Product(2, "BBBBBB", 1500f));

		prodList.forEach(p -> System.out.println(p.id + " " + p.name + " " + p.price));

		System.out.println("Sorting on the basis of name...");
		// Sorting by name
		Collections.sort(prodList, (p1, p2) -> {
			return p1.name.compareTo(p2.name);
		});

		prodList.forEach(p -> System.out.println(p.id + " " + p.name + " " + p.price));

		System.out.println("Sorting on the basis of price...");
		// Sorting by price
		Collections.sort(prodList, (p1, p2) -> {
			if (p1.price == p2.price)
				return 0;
			else if (p1.price > p2.price)
				return 1;
			else
				return -1;
		});
		prodList.forEach(p -> System.out.println(p.id + " " + p.name + " " + p.price));
		
		
		System.out.println("Sorting on the basis of name and price...");

	}

}

class Product {
	int id;
	String name;
	float price;

	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
}