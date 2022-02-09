package by.htp.sc_task08.customer;

public class CustomerDemo {
	
	/*
	 * Создать класс Customer, спецификация которого указана ниже. Определить конструкторы, сеттеры и геттеры 
	 * и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
	 * и методами. Задать критерии выбора данных и вывести эти данные на консоль.
	 * 
	 * Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карты, номер банковского счета.
	 * Найти и вывести: 
	 * а) список покупателей в алфавитном порядке;
	 * б) список покупателей, у которых номер кредитной карты находится в заданном интервале.
	 */

	public static void main(String[] args) {
		int capacity = 9;
		Customer[] customers = new Customer[capacity];
		
		customers[0] = new Customer("Горецкий", "Артем", "Валерьевич", "Warsaw, Saska 10/1",
				15438903, "60 1030 1508 0000 0005 5001 0038");		
		customers[1] = new Customer("Александрова", "Марина", "Витальевна", 
				"Park Norodovy 12/5", 12058003, "60 1030 1512 7652 0005 5001 0100");
		customers[2] = new Customer("Кацубо", "Ольга", "Викторовна", 
				"Metro Centrum 4/44", 16521212, "60 1030 1512 7652 0005 5001 1153");
		customers[3] = new Customer("Шумно", "Ян", "Теодорович", 
				"Slaska 4/12", 15440044, "60 1030 1509 0006 0005 5055 0055");
		customers[4] = new Customer("Мицкевич", "Константин", "Евгеньевич", 
				"Popularna 2/2", 12005912, "60 1030 1508 0000 0005 4910 0099");
		customers[5] = new Customer("Богданович", "Алесь", "Маркович", 
				"Husarska 18", 15446433, "60 1030 1508 2020 0005 5055 0056");
		customers[6] = new Customer("Танк", "Максим", "Максимович", 
				"Berestecka 5/15", 87779874, "60 1030 1512 9919 0005 1832 1273");
		customers[7] = new Customer("Лазенко", "Анна", "Николаевна", 
				"Narutovicha 8/6", 12054444, "60 1030 1508 9900 8558 1833 0400");
		customers[8] = new Customer("Калиновский", "Кастусь", "Адамович", 
				"Tomnicka 20", 15433287, "60 1030 1508 0676 0002 5705 1155");
		
		CustomerBase base = new CustomerBase(customers);			
		
		System.out.println("\nСписок покупателей: " + "\n");
		CustomerView.printCustomers(base);		
		
		System.out.println("\nСписок покупателей в алфавитном порядке: " + "\n");
		base.sortByAlphabet();
		CustomerView.printCustomers(base);
		
		System.out.println("\nCписок покупателей, у которых номер кредитной карты находится в заданном интервале: " + "\n");	
		CustomerView.printSortedCreditCard(base, 15440044, 15446433);				
	}
}
