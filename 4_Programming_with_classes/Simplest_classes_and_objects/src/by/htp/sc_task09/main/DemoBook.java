package by.htp.sc_task09.main;

import by.htp.sc_task09.entity.Book;
import by.htp.sc_task09.entity.BookStore;
import by.htp.sc_task09.logic.BookLogic;
import by.htp.sc_task09.view.BookView;

public class DemoBook {
	
	/*
	 * Создать класс Book , спецификация которого приведена ниже. Определить конструкторы, сеттеры и геттеры, метод toString().
	 * Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
	 * Задать критерии выбора данных и вывести эти данные на консоль.
	 * 
	 * Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
	 * Найти и вывести:
	 * а) список книг заданного автора;
	 * б) список книг, выпущенных заданным издательством;
	 * в) список книг, выпущенных после заданного года
	 */

	public static void main(String[] args) {
		BookStore books = new BookStore();
		BookLogic logic = new BookLogic();		
		
		Book book1 = new Book.Builder("Алиса в зазеркалье", "Льюис Кэрролл", "Минск", 2016).getBook();		
		Book book2 = new Book.Builder("Карлсон, который живет на крыше", "Линдгрен Астрид", "Минск", 2021)
				.appendPrice(170)
				.appendTypeOfBinding("Твердый")
				.getBook();
		
		books.addBookToStore(book1);
		books.addBookToStore(book2);		
		books.addBookToStore(new Book.Builder("Чиполлино", "Родари Джанни", "Cool", 2015).getBook());
		books.addBookToStore(new Book.Builder("Приключения Тома Сойера", "Марк Твен", "Детство", 2021).getBook());
		books.addBookToStore(new Book.Builder("Лавка древностей", "Чарльз Диккенс", "BookLook", 2018).getBook());
		
		System.out.println("Список доступных книг: ");
		BookView.printBooks(books.getBooks());
		
		Book book3 = new Book.Builder("Приключения Тома Сойера", "Марк Твен", "Cool", 2016)
				.appendPages(260)
				.appendPrice(150)				
				.getBook();
		books.addBookToStore(book3);
		book1.setTypeOfBinding("Мягкий");
		book1.setPrice(150);
		
		System.out.println("\nСписок доступных книг: ");
		BookView.printBooks(books.getBooks());		
		
		System.out.println("\nСписок книг заданного автора: ");		
		BookView.printBooks(logic.searchByAuthor(books, "Марк Твен"));
		
		System.out.println("\nСписок книг, выпущенных заданным издательством: ");
		BookView.printBooks(logic.searchByPublisher(books, "Cool"));
		
		System.out.println("\nСписок книг, выпущенных после заданного года");
		BookView.printBooks(logic.searchAfterThisYear(books, 2002));
	}
}
