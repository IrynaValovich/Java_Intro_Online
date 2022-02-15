package by.htp.ac_task05.logic;

import java.util.Comparator;

import by.htp.ac_task05.entity.TravelAgency;
import by.htp.ac_task05.entity.Voucher;

public class SortLogic {	
	
	public void sortByDuration(TravelAgency base) {
		base.getVouchers().sort(Comparator.comparing(Voucher::getDuration));
	}	
	
	public void sortByPrice(TravelAgency base) {
		base.getVouchers().sort(Comparator.comparing(Voucher::getPrice));
	}
}
