package by.htp.ac_task05.view;

import java.util.List;
import by.htp.ac_task05.entity.Voucher;

public class ShowInfo {
	
	public static void showBase(List<Voucher> vouchers) {
		System.out.println("Доступные варианты: ");
		for (Voucher v : vouchers) {
			System.out.println(v);
		}
	}
}
