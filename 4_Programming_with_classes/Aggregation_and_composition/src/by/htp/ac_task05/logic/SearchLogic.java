package by.htp.ac_task05.logic;

import java.util.ArrayList;
import java.util.List;
import by.htp.ac_task05.entity.Voucher;

public class SearchLogic {
	
	public List<Voucher> searchByDestination(String destination, List<Voucher> vouchers) {
		List<Voucher> result = new ArrayList<Voucher>();		
		for (int i = 0; i < vouchers.size(); i++) {
			if (vouchers.get(i).getDestination().equalsIgnoreCase(destination)) {
				result.add(vouchers.get(i));
			} 
		}		
		return result;		
	}	
}
