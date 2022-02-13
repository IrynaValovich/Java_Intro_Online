package by.htp.ac_task04.main;

import by.htp.ac_task04.entity.Account;
import by.htp.ac_task04.entity.Customer;
import by.htp.ac_task04.logic.AccountLogic;
import by.htp.ac_task04.logic.ComparatorByBalance;
import by.htp.ac_task04.view.AccountView;

public class Demo {
	
	/*
	 * Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета.
	 * Реализовать поиск и сортировку счетов. 
	 * Вычисление общей суммы по счетам.
	 * Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
	 */

	public static void main(String[] args) {		
		AccountLogic logic = new AccountLogic();		
		Customer customer = Customer.create("Виноградова", "Янина");		
		
		customer.addAccounts(
				Account.create("1234567091234567", 1000),
				Account.create("1234667791234567", -60),
				Account.create("1234567891234997", 300),
				Account.create("1235007540000900", -1),		
				Account.create("1234577771234567", -1200),			
				Account.create("1234167891211567", 5000));
		
		System.out.print("Счета клиента:" + customer.getLastName() + " " + customer.getFirstName());
		AccountView.printAccounts(customer.getAccounts());		
		
		System.out.print("\n\nБлокировка счетов достигших установленного отрицательного лимита");
		logic.blockAccount(customer.getAccounts());		
		AccountView.printAccounts(customer.getAccounts());			
		
		System.out.print("\n\nПоиск счета: ");
		AccountView.printAccount(logic.searchByNumberAccount("1234667791234567", customer.getAccounts()));		
		
		System.out.print("\nСортировка по балансу: ");
		logic.sortAccountsByBalance(customer.getAccounts(), new ComparatorByBalance());	
		AccountView.printAccounts(customer.getAccounts());
		
		System.out.print("\nTotal Баланс: ");
		AccountView.printBalance(logic.totalBalance(customer.getAccounts()));
		
		System.out.print("\nPositive Баланс: ");		
		AccountView.printBalance(logic.totalPositiveBalance(customer.getAccounts()));
		
		System.out.print("\nNegative Баланс: ");
		AccountView.printBalance(logic.totalNegativeBalance(customer.getAccounts()));
	}
}
