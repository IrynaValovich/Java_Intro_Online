package by.htp.ac_task04.logic;

import java.util.Collections;
import java.util.List;
import by.htp.ac_task04.entity.Account;

public class AccountLogic {
	
	public void blockAccount(List<Account> accounts) {	
		final int limit = - 50;
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getBalance() < limit) {
				accounts.get(i).setBlock(true);
			}
		}	
	}
	
	public void unBlockAccount(List<Account> accounts) {
		final int limit = 1;
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getBalance() >= limit) {
				accounts.get(i).setBlock(false);
			}
		}	
	}
		
	public Account searchByNumberAccount(String accountNumber, List<Account> accounts) {		
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getAccountNumber().equals(accountNumber)) {
				return accounts.get(i);
			}
		}
		return null;
	}	
	
	public void sortAccountsByBalance(List<Account> accounts, ComparatorByBalance comparator) {		
		Collections.sort(accounts, comparator);			
	}
	
	public int totalBalance(List<Account> accounts) {
		int totalBalance = 0;
		for (int i = 0; i < accounts.size(); i++) {
			totalBalance += accounts.get(i).getBalance(); 
		}
		return totalBalance;		
	}
	
	public int totalPositiveBalance(List<Account> accounts) {
		int totalPlusBalance = 0;
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getBalance() >= 0) {
				totalPlusBalance += accounts.get(i).getBalance();				
			}
		}
		return totalPlusBalance;
	}
	
	public int totalNegativeBalance(List<Account> accounts) {
		int totalMinusBalance = 0;
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getBalance() < 0) {
				totalMinusBalance -= accounts.get(i).getBalance();
			}
		}
		return -totalMinusBalance;
	}
}
