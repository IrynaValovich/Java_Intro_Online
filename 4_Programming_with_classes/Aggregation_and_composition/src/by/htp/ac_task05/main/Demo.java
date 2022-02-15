package by.htp.ac_task05.main;

import by.htp.ac_task05.entity.FoodPackage;
import by.htp.ac_task05.entity.Transport;
import by.htp.ac_task05.entity.TravelAgency;
import by.htp.ac_task05.entity.TravelType;
import by.htp.ac_task05.entity.Voucher;
import by.htp.ac_task05.view.UserMenu;

public class Demo {
	
	/*
 	 * Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа (отдых, экскурсии, лечение,
 	 * шопинг, круиз и т.д.) для оптимального выбора. 
 	 * Учитывать возможность выбора транспорта, питания и числа дней.
 	 * Реализовать выбор и сортировку путевок.
 	 */

	public static void main(String[] args) {		
		TravelAgency base = new TravelAgency();		
		
		Voucher v1 = new Voucher.Builder(TravelType.EXCURSION, "Барселона")
				.appendTransport(Transport.PLANE)
				.appendFood(FoodPackage.BED_AND_BREAKFAST)
				.appendPerson(2)
				.appendDuration(3)
				.appendPrice(600)
				.createVoucher();
		Voucher v2 = new Voucher.Builder(TravelType.EXCURSION, "Австрия")
				.appendTransport(Transport.TRAIN)
				.appendFood(FoodPackage.ROOM_ONLY)
				.appendPerson(2)
				.appendDuration(6)
				.appendPrice(650)
				.createVoucher();
		Voucher v3 = new Voucher.Builder(TravelType.BEACH, "Аруба")
				.appendTransport(Transport.PLANE)
				.appendFood(FoodPackage.ULTRA_ALL_INCLUSIVE)
				.appendPerson(2)
				.appendDuration(7)
				.appendPrice(3500)
				.createVoucher();
		Voucher v4 = new Voucher.Builder(TravelType.BEACH, "Тенерифе")
				.appendTransport(Transport.PLANE)
				.appendFood(FoodPackage.HALF_BOARD)
				.appendPerson(3)
				.appendDuration(11)
				.appendPrice(1800)
				.createVoucher();
		Voucher v5 = new Voucher.Builder(TravelType.BEACH, "Ларнака")
				.appendTransport(Transport.PLANE)
				.appendFood(FoodPackage.ALL_INCLUSIVE)
				.appendPerson(3)
				.appendDuration(14)
				.appendPrice(2200)
				.createVoucher();
		Voucher v6 = new Voucher.Builder(TravelType.TREATMENT, "Сопот")
				.appendTransport(Transport.BUS)
				.appendFood(FoodPackage.FULL_BOARD)
				.appendPerson(2)
				.appendDuration(21)
				.appendPrice(900)
				.createVoucher();
		Voucher v7 = new Voucher.Builder(TravelType.TREATMENT, "Краков")
				.appendTransport(Transport.BUS)
				.appendFood(FoodPackage.FULL_BOARD)
				.appendPerson(1)
				.appendDuration(14)
				.appendPrice(700)
				.createVoucher();
		Voucher v8 = new Voucher.Builder(TravelType.CRUISE, "Норвегия")
				.appendTransport(Transport.SHIP)
				.appendFood(FoodPackage.FULL_BOARD)
				.appendPerson(2)
				.appendDuration(9)
				.appendPrice(1100)
				.createVoucher();
		Voucher v9 = new Voucher.Builder(TravelType.SHOPPING, "Вильнюс")
				.appendTransport(Transport.BUS)
				.appendFood(FoodPackage.NONE)
				.appendPerson(1)
				.appendDuration(1)
				.appendPrice(100)
				.createVoucher();
		Voucher v10 = new Voucher.Builder(TravelType.SHOPPING, "Афины")
				.appendTransport(Transport.PLANE)
				.appendFood(FoodPackage.BED_AND_BREAKFAST)
				.appendPerson(2)
				.appendDuration(3)
				.appendPrice(300)
				.createVoucher();		
		
		base.addVouchers(v1, v2, v3, v4, v5, v6, v7, v8, v9, v10);
		
		UserMenu.menuComposition(base);		
	}
}
