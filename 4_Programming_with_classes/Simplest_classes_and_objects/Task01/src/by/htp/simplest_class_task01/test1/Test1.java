package by.htp.simplest_class_task01.test1;

public class Test1 {
	
	private int firstNumber;
	private int secondNumber;
	
	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}
	
	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}	
	 
	public void printTest1Numbers() {
		System.out.println("firstNumber = " + firstNumber + "\nsecondNumber = " + secondNumber);		
	}
	
	public int countSumOfNumbers() {
		return firstNumber + secondNumber; 
	}
	
	public int findMaxValue() {
		int maxValue = 0;
		if (firstNumber != secondNumber) {
			maxValue = firstNumber > secondNumber ? firstNumber : secondNumber; 
			return maxValue;
		}
		return maxValue;		
	}
}
