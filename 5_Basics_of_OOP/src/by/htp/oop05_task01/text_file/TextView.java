package by.htp.oop05_task01.text_file;

public class TextView {
	
	public static void printFiles(Directory directory) {
		System.out.println("Директория: " + directory.getTitle());		
		System.out.println("Файлы: ");
		for (TextFile file : directory.getTextFiles()) {
			System.out.println(file.getName() + file.getFormat());			
		}
	}
	
	public static void printText(TextFile file) {
		System.out.println(file.getBody().getText());
	}
}
