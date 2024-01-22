package com.concordia.exercise;

public class Book {
	private String title;
	private String author;
	private String ISBN;
	private boolean isAvailable;

	public Book(String title, String author, String ISBN) {
		this.title = title;
		this.author = author;
		this.ISBN = ISBN;
		this.isAvailable = true;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getISBN() {
		return ISBN;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void checkoutBook() {
		if (isAvailable) {
			isAvailable = false;
			System.out.println("Book checked out: " + title);
		} else {
			System.out.println("Book is not available for checkout: " + title);
		}
	}

	public void returnBook() {
		if (!isAvailable) {
			isAvailable = true;
			System.out.println("Book returned: " + title);
		} else {
			System.out.println("Book is already available: " + title);
		}
	}
}
