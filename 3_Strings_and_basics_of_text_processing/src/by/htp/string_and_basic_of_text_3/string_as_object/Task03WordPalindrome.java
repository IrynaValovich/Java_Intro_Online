package by.htp.string_and_basic_of_text_3.string_as_object;

public class Task03WordPalindrome {
	
	// Проверить, является ли заданное слово палиндромом

	public static void main(String[] args) {
		String word = new String("заказ");
		
		long start = System.nanoTime();
		boolean result = isWordPalindrome(word);
		long stop = System.nanoTime();
		
		String message = result ? "Слово является палиндромом" : "Слово не является палиндромом";
		System.out.println(message);
		System.out.println("Время выполнения программы: " + (stop-start));
	}
	
	private static boolean isWordPalindrome(String wordToCheck) {
		if (wordToCheck != null) {
			for (int charIndex = 0; charIndex < wordToCheck.length();) {
				if (wordToCheck.charAt(charIndex) == wordToCheck.charAt((wordToCheck.length() - 1) - charIndex)) {
					return true;
				} else {
					return false;
				}
			}			
		}		
		return true;
	}
}
