package by.htp.basic_of_software_1.linear;

import java.util.Scanner;

public class Task32 {
	
	/*
	 * Текущее показание электронных часов: m ч (0 <= m <=23) п мин (0 <= п <= 59) к с (0 <= к <= 59).
	 * Какое время будут показывать часы через р ч q мин r с?
	 */

	public static void main(String[] args) {		
		int m = 19;
		int n = 20;
		int k = 40;      
        
		System.out.println("Текущее показание электронных часов: " + m + " ч. " + n + " мин. " + k + " c.");
		System.out.println("Какое время будут показывать часы через р ч q мин r с?");
		
		int p;
		int q;
		int r;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Введи значение p >> ");
		p = scan.nextInt();
		System.out.println("Введи значение q >> ");
		q = scan.nextInt();
		System.out.println("Введи значение r >> ");
		r = scan.nextInt();
		
		int tSec = m * 3600 + n * 60 + k; // текущее время в секундах
		int periodSec = p * 3600 + q * 60 + r; // сколько времени пройдет в секундах
		int hFinal = ((tSec + periodSec) / 3600);
		int i = (tSec + periodSec) - (hFinal * 3600);
		int mFinal = i / 60;
		int secFinal = i - (mFinal * 60);
		
		int hResult = 0;
		hResult = hFinal > 23 ? hFinal - (hFinal/24) * 24 : hFinal;
		System.out.println("Через: " + p + " ч. " + q + " мин. " + r + " c.");
		System.out.println("Будет: " + hResult + " ч. " + mFinal + " мин. " + secFinal + " c.");		 		     
	}	
}
