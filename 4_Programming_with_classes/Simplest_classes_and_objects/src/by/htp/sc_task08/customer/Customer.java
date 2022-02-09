package by.htp.sc_task08.customer;

import java.util.Comparator;

public class Customer {	
	
	//поле id будет уникальным для каждого покупателя и создаваться автоматически путем ID++	
	private static int ID;	
	private int id;	
	private String surname;
	private String name;
	private String patronymic;
	private String address;	
	private int creditCard;
	private String bankAccount;	
	
	public Customer(String surname, String name, String patronymic, String address, int creditCard, String bankAccount) {
		this.id = ID++;		
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = address;
		this.creditCard = creditCard;
		this.bankAccount = bankAccount;	
		if(this.surname == null || this.name == null || this.creditCard == 0) {
			throw new IllegalArgumentException("Поля фамилия, имя и номер кредитной карты не могут быть null");
		}
	}
	
	public int getId() {
		return id;
	}	
	
	public String getSurname() {
		return surname;
	}
	
	public String getName() {
		return name;
	}
	
	public String getPatronymic() {
		return patronymic;
	}	
	
	public String getAddress() {
		return address;
	}
	
	public int getCreditCard() {
		return creditCard;
	}
	
	public String getBankAccount() {
		return bankAccount;
	}
	
	public void setSurname(String surname) {
		this.surname = surname;		
	}	
	
	public void setAddress(String address) {
		this.address = address;
	}	
	
	public void setCreditCard(int creditCard) {
		this.creditCard = creditCard;
	}
	
	public void setBankAccount(String bankAccount) {
		this.bankAccount = bankAccount;		
	}	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + creditCard;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (creditCard != other.creditCard)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + String.format(" id-> %d| surname-> %-12s| name-> %-11s| patronymic-> %-11s|"
				+ " address: %-19s| creditCard: %-9d| bankAccount: %s",
				getId(), getSurname(), getName(), getPatronymic(), getAddress(), getCreditCard(), getBankAccount());		
	}	
	
	public static class AlphabetComparator implements Comparator<Customer> {
		@Override
		public int compare(Customer customer1, Customer customer2) {
			if (customer1.getSurname() != customer2.getSurname()) {
				return customer1.getSurname().compareTo(customer2.getSurname());
			}
			if (customer1.getName() != customer2.getName()) {
				return customer1.getName().compareTo(customer2.getName());				
			}
			return customer1.getPatronymic().compareTo(customer2.getPatronymic());
		}		
	}	
}
