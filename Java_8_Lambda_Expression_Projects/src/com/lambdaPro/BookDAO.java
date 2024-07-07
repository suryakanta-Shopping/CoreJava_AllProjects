package com.lambdaPro;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

	public List<Book> getBooks() {
		List<Book> books = new ArrayList<Book>();
		books.add(new Book(101, "susi", 111));
		books.add(new Book(220, "Lipu", 120));
		books.add(new Book(343, "Siku", 390));
		books.add(new Book(452, "Anil", 353));
		books.add(new Book(132, "raka", 784));
		books.add(new Book(252, "Waso", 563));
		books.add(new Book(282, "papi", 455));

		return books;
	}
}
