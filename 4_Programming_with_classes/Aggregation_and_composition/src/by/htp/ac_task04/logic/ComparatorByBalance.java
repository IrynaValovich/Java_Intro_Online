package by.htp.ac_task04.logic;

import java.util.Comparator;

import by.htp.ac_task04.entity.Account;

public class ComparatorByBalance implements Comparator<Account> {

	@Override
	public int compare(Account account1, Account account2) {
		if (account1.getBalance() < account2.getBalance()) {
			return -1;
		} else if (account1.getBalance() > account2.getBalance()) {
			return 1;
		} else {
			return 0;
		}		
	}
}
