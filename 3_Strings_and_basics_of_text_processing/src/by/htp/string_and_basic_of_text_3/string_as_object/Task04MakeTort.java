package by.htp.string_and_basic_of_text_3.string_as_object;

public class Task04MakeTort {
	
	// С помощью функции копирования и операции конкатенации составить из частей слова "информатика" слово "торт"

	public static void main(String[] args) {
		String informatica = "информатика";
		String tort;
		tort = String.valueOf(informatica.charAt(informatica.indexOf('т')));
		tort += String.valueOf(informatica.charAt(informatica.indexOf('о')));
		tort += String.valueOf(informatica.charAt(informatica.indexOf('р')));
		tort += String.valueOf(informatica.charAt(informatica.indexOf('т')));		
		System.out.println(tort);
	}	
}
