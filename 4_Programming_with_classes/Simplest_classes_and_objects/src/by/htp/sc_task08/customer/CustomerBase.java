package by.htp.sc_task08.customer;

import java.util.Arrays;

public class CustomerBase {
		
	private int capacity; 
	private Customer[] customers;	
	
	public CustomerBase(int capacity) {
		this.capacity = capacity;		
		this.customers = new Customer[capacity];
	}
	
	public CustomerBase(Customer[] customers) {
		this.customers = customers;
	}	
	
	public Customer[] getCustomers(){
		return customers;
	}	
	
	public int getCapacity() {
		return capacity;
	}
	
	public void sortByAlphabet() {
		int start = 0;
		Arrays.sort(getCustomers(), start, getCustomers().length, new Customer.AlphabetComparator());		
	}	

	@Override
	public String toString() {
		return getClass().getSimpleName() + " " + Arrays.toString(customers) + ", емкость: " + getCapacity();
	}	
}
