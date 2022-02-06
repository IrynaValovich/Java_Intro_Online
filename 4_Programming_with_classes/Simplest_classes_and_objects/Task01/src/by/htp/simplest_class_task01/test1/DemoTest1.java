package by.htp.simplest_class_task01.test1;

public class DemoTest1 {
	
	/*
	 * Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных. Добавьте метод, 
	 * который находит сумму значений этих переменных, и метод, который находит наибольшее значение из этих двух переменных.
	 */
	
	
	public static void main(String[] args) {
		Test1 test = new Test1();
		test.printTest1Numbers();
		
		int number1 = 10;
		int number2 = 15;		
		test.setFirstNumber(number1);
		test.setSecondNumber(number2);
		test.printTest1Numbers();
		
		int sum;
		sum = test.countSumOfNumbers();
		System.out.println(sum);
		
		int maxValue;
		maxValue = test.findMaxValue();
		System.out.println(maxValue);
	}
}
