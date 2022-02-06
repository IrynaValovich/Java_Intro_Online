package by.htp.simplest_class.task02;

public class DemoTest2 {
	
	/*
	 * Создайте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте конструктор, инициализирующий
	 * члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра класса.
	 */	

	public static void main(String[] args) {
		Test2 test = new Test2();		
		Test2 test2 = new Test2(1, 4);	
		
		int oneTest = test.getFirst();
		int twoTest = test.getSecond();
		int oneTest2 = test2.getFirst();
		int twoTest2 = test2.getSecond();
		
		System.out.println(oneTest + ", " + twoTest);
		System.out.println(oneTest2 + ", " + twoTest2);
		
		int testNumber1 = 6;
		int testNumber2 = 400;
		test.setFirst(testNumber1);
		test.setSecond(testNumber2);
		System.out.println(test.getFirst());
		System.out.println(test.getSecond());
	}
}
