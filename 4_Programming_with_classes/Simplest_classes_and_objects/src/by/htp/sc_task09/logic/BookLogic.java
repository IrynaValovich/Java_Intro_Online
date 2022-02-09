package by.htp.sc_task09.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.sc_task09.entity.Book;
import by.htp.sc_task09.entity.BookStore;

public class BookLogic {
	
	public List<Book> searchByAuthor(BookStore store, String author){
		List<Book> booksByAuthor = new ArrayList<Book>();
		for (int i = 0; i < store.getBooks().size(); i++) {
			if (store.getBooks().get(i).getAuthor().equalsIgnoreCase(author)){
				booksByAuthor.add(store.getBooks().get(i));
			}
		}
		return booksByAuthor;		
	}
	
	public List<Book> searchByPublisher(BookStore store, String publisher){
		List<Book> booksByPublisher = new ArrayList<Book>();
		for (int i = 0; i < store.getBooks().size(); i++) {
			if (store.getBooks().get(i).getPublisher().equalsIgnoreCase(publisher)) {
				booksByPublisher.add(store.getBooks().get(i));
			}
		}
		return booksByPublisher;
	}
	
	public List<Book> searchAfterThisYear(BookStore store, int year) {
		List<Book> booksAfterYear = new ArrayList<Book>();
		for (int i = 0; i < store.getBooks().size(); i++) {
			if (store.getBooks().get(i).getYear() > year) {
				booksAfterYear.add(store.getBooks().get(i));
			}
		}
		return booksAfterYear;		
	}
}
