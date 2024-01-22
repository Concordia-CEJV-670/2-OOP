package com.concordia.exercise;

import java.util.ArrayList;

public class Library {
	private ArrayList<Book> books;

	public Library() {
		this.books = new ArrayList<>();
	}

	public void addBook(Book book) {
		books.add(book);
		System.out.println("Book added to the library: " + book.getTitle());
	}

	public void displayAvailableBooks() {
		System.out.println("Available Books in the Library:");
		for (Book book : books) {
			if (book.isAvailable()) {
				System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
			}
		}
		System.out.println();
	}
}
