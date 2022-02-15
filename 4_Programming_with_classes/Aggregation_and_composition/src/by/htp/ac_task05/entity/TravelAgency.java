package by.htp.ac_task05.entity;

import java.util.ArrayList;
import java.util.List;

public class TravelAgency {
	
	private List<Voucher> vouchers;
	
	public TravelAgency() {
		vouchers = new ArrayList<Voucher>();
	}
	
	public TravelAgency(List<Voucher> vouchers) {
		this.vouchers = vouchers;
	}
	
	public List<Voucher> getVouchers() {
		return vouchers;
	}
	
	public void addVouchers(Voucher... voucher) {
		for (int i = 0; i < voucher.length; i++) {
			vouchers.add(voucher[i]);
		}
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + " ваучеры: " + "\n" + getVouchers();
	}
}
