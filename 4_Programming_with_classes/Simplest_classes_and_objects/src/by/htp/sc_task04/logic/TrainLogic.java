package by.htp.sc_task04.logic;

import by.htp.sc_task04.entity.Depo;
import by.htp.sc_task04.entity.Train;

public class TrainLogic {
	
	public void sortByNumber(Depo depo) {		
		for (int i = 1; i < Depo.getLength(); i++) {
			for (int j = Depo.getLength() - 1; j >= i; j--) {
				if (depo.getTrains()[j - 1].getTrainNumber() > depo.getTrains()[j].getTrainNumber()) {
					swapElements(depo, j);
				}				
			}			
		}		
	}
	
	public static boolean findByNumber(Depo depo, int number) {
		for (int i = 0; i < Depo.getLength(); i++) {
			if (depo.getTrains()[i].getTrainNumber() == number) {
				return true;
			}			
		}
		return false;
	}
	
	public void sortByDestination(Depo depo) {
		boolean flag = true;
		while (flag) {
			flag = false;
			for (int i = 0; i < Depo.getLength() - 1; i++) {
				int comparator;
				comparator = depo.getTrains()[i].getDestination().compareTo(depo.getTrains()[i + 1].getDestination());
				if (comparator == 0) {
					if (depo.getTrains()[i].getDepartureTime().compareTo(depo.getTrains()[i + 1].getDepartureTime()) > 0) {
						swapDestinationElements(depo, i);
						flag = true;						
					}
				} else if (comparator > 0) {
					swapDestinationElements(depo, i);
					flag = true;
				}
			}
		}
	}	
	
	private void swapElements(Depo depo, int index)	{
		Train temp;
		temp = depo.getTrains()[index - 1];
		depo.getTrains()[index - 1] = depo.getTrains()[index];
		depo.getTrains()[index] = temp;		
	}
	
	private void swapDestinationElements(Depo depo, int index) {
		Train temp;
		temp = depo.getTrains()[index];
		depo.getTrains()[index] = depo.getTrains()[index + 1];
		depo.getTrains()[index + 1] = temp;
	}
}
