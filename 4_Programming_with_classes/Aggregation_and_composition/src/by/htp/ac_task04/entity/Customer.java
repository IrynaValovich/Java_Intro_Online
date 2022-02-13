package by.htp.ac_task04.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Customer {	
	
	private String lastName;
	private String firstName;
	private List<Account> accounts;	
	
	public static Customer create(String lastName, String firstName) {
		Customer customer = new Customer();
		customer.setLastName(lastName);
		customer.setFirstName(firstName);
		customer.setAccounts(new ArrayList<Account>());		
		return customer;		
	}
	
	private Customer() {}
	
	public void addAccounts(Account... account) {
		for (int i = 0; i < account.length; i++) {
			accounts.add(account[i]);
		}
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public List<Account> getAccounts(){
		return accounts;
	}
	
	public void setLastName(String lastName) {
		this.lastName = validate(lastName);
	}
	
	public void setFirstName(String firstName) {
		this.firstName = validate(firstName);
	}
	
	public void setAccounts(List<Account> accounts) {
		this.accounts = accounts;
	}	
	
	private String validate(String name) {
		Pattern pattern = Pattern.compile("^[А-ЯЁ][а-яё]+$");
		Matcher matcher = pattern.matcher(name);
		if (!matcher.matches()) {
			return "wrong format";
		} else {
			return name;
		}		
	}

	@Override
	public int hashCode() {
		return Objects.hash(accounts, firstName, lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(accounts, other.accounts) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(lastName, other.lastName);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + String.format(" Фамилия: %-10s| Имя: %-14s| счета: %s", 
				getLastName(), getFirstName(), getAccounts());
	}	
}
