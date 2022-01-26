package by.htp.basic_of_software_1.linear;

public class Task07 {
	
	/*
	 * Написать код для решения задачи. В n-малых бидонах 80 л молока.
	 * Сколько литров молока в m больших бидонах, если в каждом большом бидоне на 12 л. больше, 
	 * чем в малом.
	 */

	public static void main(String[] args) {		
		int n = 10;
		int m = 6;
		
		double milknBidon;
		double mdifonebidon;        
		milknBidon = 80; // Литров молока в малых бидонах        
		mdifonebidon = 12.0; //Разница между объемом молока в большом и малом бидоне

		double mSum;        
		mSum = m * (milknBidon / n + mdifonebidon);        
		System.out.println("Если малых бидонов " + n + ", и больших " + m + ", то в больших бидонах " + mSum + " литров молока");
	}	
}
