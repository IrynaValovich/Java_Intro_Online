package by.htp.sc_task09.entity;

import java.util.ArrayList;
import java.util.List;

public class BookStore {
	
	private List<Book> books;
	
	public BookStore() {
		books = new ArrayList<Book>();
	}
	
	public BookStore(List<Book> bookStore) {
		books = bookStore;
	}
	
	public List<Book> getBooks() {
		return books;		
	}
	
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public void addBookToStore(Book book) {
		this.books.add(book);
	}
	
	public void removeBookFromStore(Book book) {
		this.books.remove(book);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + getBooks();
	}
}
