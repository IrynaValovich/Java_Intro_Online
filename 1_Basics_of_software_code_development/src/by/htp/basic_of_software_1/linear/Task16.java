package by.htp.basic_of_software_1.linear;

public class Task16 {
	
	// Найти произведение цифр заданного четырехзначного числа

	public static void main(String[] args) {		
		int n = 2114;		
		double digit1;
		digit1 = n % 10; // с помощью оператора % вычленяю цифру 4
		
		int n2;
		n2 = n / 10; // получаю целое число без 4-ки на конце, то есть 211		
		double digit2;
		digit2 = n2 % 10; // вычленяю первую единицу (1)
		
		int n3;
		n3 = n2 / 10; // получаю 21	
		
		double digit3;
		double digit4;    
                
        digit3 = n3 % 10; // вычленяю вторую единицу (1)         
        digit4 = n3 / 10; // вычленяю цифру 2        
        
        int result;
        result = (int) (digit1 * digit2 * digit3 * digit4);       
        System.out.println("Произведение цифр числа " + n + " равняется " + result);              
	}	
}
