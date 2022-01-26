package by.htp.basic_of_software_1.linear;

public class Task36 {
	
	// Найти частное произведений четных и нечетных цифр четырехзначного числа

	public static void main(String[] args) {		
		int number = 3728;		
			
		double digit1 = number % 10; // вычленяю цифру 4		
		int number2 = number / 10; // получаю 138		
		double digit2 = number2 % 10; // вычленяю 8		
		int number3 = number2 / 10; // получаю 13                
		double digit3 = number3 % 10; // вычленяю 3         
		double digit4 = number3 / 10; // вычленяю 1

		double multEven = digit2 * digit4;
		double multOdd = digit1 * digit3;
		double result = multEven / multOdd;        
        
		System.out.println("Произведение четных цифр числа = " + multEven);
		System.out.println("Произведение нечетных цифр числа = " + multOdd);
		System.out.println("Частное произведения четных и нечетных цифр = " + result);		    
	}	
}
