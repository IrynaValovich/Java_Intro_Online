package by.htp.oop05_task02.payment;

import by.htp.oop05_task02.payment.Payment.Product;

public class Demo {
	
	// Создать класс Payment с внутренним классом, с помощью объектов которого можно сформировать покупку нескольких товаров

	public static void main(String[] args) {
		
		Payment payment = new Payment();		
		payment.addProduct(new Product("Молоко", 2), new Product("Хлеб", 3), new Product("Рис", 7));		
		PaymentView.printPayment(payment);			
		System.out.println("Общая стоимость покупок = " + payment.calculateTotalPayment());			
	}
}
