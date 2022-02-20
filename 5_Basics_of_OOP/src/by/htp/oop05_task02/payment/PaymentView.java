package by.htp.oop05_task02.payment;

public class PaymentView {
	
	public static void printPayment(Payment payment) {
		for (Payment.Product p : payment.getProducts()) {
			System.out.println("Товар: " + p.getName() + ", стоимость: " + p.getPrice());
		}		
	}
}
