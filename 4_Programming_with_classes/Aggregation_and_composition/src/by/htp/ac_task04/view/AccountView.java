package by.htp.ac_task04.view;

import java.util.List;
import by.htp.ac_task04.entity.Account;

public class AccountView {	
	
	public static void printAccounts(List<Account> accounts) {
		for (Account account : accounts) {
			System.out.print(account);
		}		
	}
	
	public static void printAccount(Account account) {
		System.out.println(account);		
	}
	
	public static void printBalance(int balance) {		
		System.out.println(balance);		
	}
}
