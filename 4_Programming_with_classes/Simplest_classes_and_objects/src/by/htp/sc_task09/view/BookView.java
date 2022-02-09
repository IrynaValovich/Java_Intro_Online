package by.htp.sc_task09.view;

import java.util.List;

import by.htp.sc_task09.entity.Book;

public class BookView {
	
	public static void printBooks(List<Book> books) {
		for (Book book : books) {
			System.out.println(book + " ");			
		}
	}
}
