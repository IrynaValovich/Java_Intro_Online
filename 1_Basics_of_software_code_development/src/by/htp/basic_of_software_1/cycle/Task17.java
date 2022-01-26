package by.htp.basic_of_software_1.cycle;

public class Task17 {
	
	// Даны действительное (а) и натуральное (n). Вычислить: a(a+1)...(a+n-1)

	public static void main(String[] args) {		
		double a = 1.5;
		int n = 10;	       
        double mult = 1;
        for (int i = 0; i < n; i++) {        	
            mult = mult * (a + i);            
        }        
        System.out.println("Произведение равно " + mult);        
	}
}
