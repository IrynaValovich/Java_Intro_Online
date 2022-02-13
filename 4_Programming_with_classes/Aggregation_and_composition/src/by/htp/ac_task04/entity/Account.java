package by.htp.ac_task04.entity;

import java.util.Objects;

public final class Account{
	
	private final static int LIMIT = 16;	
	private String accountNumber;	
	private int balance;	
	private boolean block;
	
	public static Account create(String accountNumber, int balance) {
		Account account = new Account();
		account.setAccountNumber(accountNumber);
		account.setBalance(balance);				
		account.setBlock(false);		
		return account;
	}
	
	private Account() {}
	
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public int getBalance() {
		return balance;
	}
	
	public boolean isBlock() {
		return block;
	}
	
	private void setAccountNumber(String accountNumber) {
		this.accountNumber = validate(accountNumber);
	}
	
	public void setBlock(boolean block) {
		this.block = block;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}	
	
	private String validate(String name) {
		return (name.length() > LIMIT || name.length() < LIMIT ) ? "здесь должно быть 16 цифр" : name;				
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(accountNumber, other.accountNumber);
	}

	@Override
	public String toString() {
		return "\n" + getClass().getSimpleName() + String.format(" accountNumber: %-13s| balance: %-10d| block: %s",
				getAccountNumber(), getBalance(), isBlock());
	}	
}
