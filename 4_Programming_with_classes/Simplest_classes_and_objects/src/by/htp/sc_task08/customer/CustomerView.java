package by.htp.sc_task08.customer;

public class CustomerView {
	
	public static void printCustomers(CustomerBase base) {
		for (Customer customer : base.getCustomers()) {
			System.out.println(customer + " ");
		}
	}
	
	public static void printSortedCreditCard(CustomerBase base, int startInterval, int endInterval) {		
		for (int i = 0; i < base.getCustomers().length; ++i) {
			if (base.getCustomers()[i].getCreditCard() <= endInterval && base.getCustomers()[i].getCreditCard() >= startInterval) {
				System.out.println(base.getCustomers()[i]);				
			}
		}				
	}
}
