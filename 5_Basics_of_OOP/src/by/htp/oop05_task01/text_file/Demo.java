package by.htp.oop05_task01.text_file;

public class Demo {	
	/*
	 * Создать объект класса Текстовый файл, используя классы Файл, Директория. 
	 * Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.
	 */

	public static void main(String[] args) {
		Directory d = new Directory("Детская литература");
		TextFile fish = TextFile.createFile("Сказка о рыбаке и рыбке", d);
		TextFile kolobok = TextFile.createFile("Колобок", d);
		TextFile snowWoman = TextFile.createFile("Снежная королева", d);
		TextFile magazin = TextFile.createFile("Мурзилка", d);
		TextView.printFiles(d);
		
		kolobok.obtainBody("Some text test" + " one more string");
		snowWoman.obtainBody("And one more time bla-bla-bla");
		
		TextView.printText(kolobok);
		
		fish.renameFile("Золотая рыбка");
		d.removeTextFile(magazin);
		d.renameDirectory("Детские сказки");
		TextView.printFiles(d);
	}
}
