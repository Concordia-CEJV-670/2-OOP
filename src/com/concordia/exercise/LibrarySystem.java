package com.concordia.exercise;

public class LibrarySystem {

	public static void main(String[] args) {
		Library library = new Library();

		Book book1 = new Book("The Catcher in the Rye", "J.D. Salinger", "978-0-316-76948-0");
		FictionBook book2 = new FictionBook("To Kill a Mockingbird", "Harper Lee", "978-0-06-112008-4", "Drama");
		Book book3 = new Book("1984", "George Orwell", "978-0-452-28423-4");

		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);

		System.out.println("\n******\n");

		// Display available books in the library
		library.displayAvailableBooks();

		System.out.println("******\n");

		// Demonstrate checking out and returning books
		book1.checkoutBook();
		book2.checkoutBook();

		System.out.println("\n******\n");

		library.displayAvailableBooks();

		System.out.println("******\n");

		book1.returnBook();

		System.out.println("\n******\n");

		library.displayAvailableBooks();

		System.out.println("******\n");

		book2.returnBook();

		System.out.println("\n******\n");

		library.displayAvailableBooks();
	}

}
