package by.htp.sc_task04.view;

import by.htp.sc_task04.entity.Depo;
import by.htp.sc_task04.entity.Train;

public class TrainView {
	
	public static void printTrain(Train train) {
		System.out.println(train);		
	}
	
	public static void printTrains(Depo depo) {
		for (Train train : depo.getTrains()) {
			System.out.println(train + " ");			
		}
	}
	
	public static void printByNumber(Depo depo, int number) {
		for (int i = 0; i < Depo.getLength(); i++) {
			if (depo.getTrains()[i].getTrainNumber() == number) {
				System.out.println(depo.getTrains()[i] + " ");
				break;
			}
		}		
	}
}
