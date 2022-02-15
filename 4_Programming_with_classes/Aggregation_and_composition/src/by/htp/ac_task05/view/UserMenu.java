package by.htp.ac_task05.view;

import java.util.Scanner;
import by.htp.ac_task05.entity.TravelAgency;
import by.htp.ac_task05.logic.SearchLogic;
import by.htp.ac_task05.logic.SortLogic;

public class UserMenu {
	
	private static Scanner scan = new Scanner(System.in);	
	
	public static void menuComposition(TravelAgency agency) {
		ShowInfo.showBase(agency.getVouchers());
		mainMenu(agency);
	}
	
	private static void mainMenu(TravelAgency agency) {
		SearchLogic search = new SearchLogic();
		
		String message = "\nНажми 1, чтобы найти тур по локации"
				+ "\nНажми 2, для сортировки ваучеров"
				+ "\nНажми 0 для выхода из программы"
				+ "\nСделай выбор >> ";
		int menuChoice;
		menuChoice = Input.getNumberFromUser(message);
		
		switch(menuChoice) {
			case 0: System.exit(0);
			case 1:
				System.out.print("Введи город/страну >> ");
				String tempString = scan.nextLine();
				System.out.println(search.searchByDestination(tempString, agency.getVouchers()));
				break;
			case 2: 
				sortMenu(agency);
				break;
			default: 
				System.out.println("Такого пункта в меню нет");
				mainMenu(agency);
		}		
	}	
	
	private static void sortMenu(TravelAgency agency) {	
		SortLogic sort = new SortLogic();
		String message = "\n 1 - сортировка по дням"
				+ "\n 2 - сортировка по цене"
				+ "\n 3 - возврат в главное меню"
				+ "\n 0 - выход из программы"
				+ "\nСделай выбор >> ";
		int menuChoice;
		menuChoice = Input.getNumberFromUser(message);		
		switch(menuChoice) {
			case 0: System.exit(0);
			case 1:	
				sort.sortByDuration(agency);
				ShowInfo.showBase(agency.getVouchers());
				break;
			case 2:				
				sort.sortByPrice(agency);
				ShowInfo.showBase(agency.getVouchers());
				break;
			case 3:
				mainMenu(agency);
				break;
			default: System.out.println("Такого пункта в меню нет");				
		}		
	}	
}
