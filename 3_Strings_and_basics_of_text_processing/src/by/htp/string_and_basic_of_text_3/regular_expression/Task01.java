package by.htp.string_and_basic_of_text.regular_expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task01 {
	
	/*
	 * Создать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнить с
	 * текстом три различные операции:
	 * 1. отсортировать абзацы по количеству предложений;
	 * 2. в каждом предложении отсортировать слова по длине;
	 * 3. отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,
	 * а в случае равенства - по алфавиту.
	 */
	
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		String text;
		String messageForUser;
		
		text = "Прежние цивилизации утверждали, что они основаны на любви и справедливости."
				+ "Наша основана на ненависти.\n" 
				+ "В нашем мире не будет иных чувств, кроме страха, гнева, торжества и самоуничижения."
				+ "Все остальные мы истребим.Все.Мы искореняем прежние способы мышления.\n"
				+ "Не будет иной верности, кроме партийной верности.\n"
				+ "Не будет искусства, литературы, науки.Не будет различия между уродливым и прекрасным." 
				+ "Исчезнет любознательность,жизнь не будет искать себе применения."
				+ "С разнообразием удовольствий мы покончим.\n"
				+ "Но всегда - запомните, Уинстон, - всегда будет опьянение властью, и чем дальше, тем сильнее, тем острее!";
		
		
		messageForUser = "\nНажми 1, чтобы отсортировать абзацы по количеству предложений"
				+ "\nНажми 2 и отсортируй слова по длине в каждом предложении"
				+ "\nНажми 3, чтобы отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,\n"
				+ "а в случае равенства - по алфавиту"
				+ "\nНажми 0 для выхода из приложения ";
		
		int command;
		command = getCommandFromUser(messageForUser);		
		String regexLexeme = "р";		
		
		switch(command) {		
		case 1:
			sortParagraphsBySentencesAmount(text);
			break;
		case 2:
			sortWordsInSentencesByLength(text);
			break;
		case 3:
			System.out.println("Заданный символ " + regexLexeme + "\n");
			sortLexemesByPattern(text, regexLexeme);
			break;
		case 0:
			System.out.println("Завершение работы приложения");
			break;
		default: System.out.println("Такого пункта нет в меню. Перезагрузи приложение");			
		}		
	}
	
	private static int enterFromConsole(String message) {
		System.out.print(message);
		while(!scan.hasNextInt()) {
			scan.next();
			System.out.print(message);
		}
		return scan.nextInt();
	}
	
	private static int getCommandFromUser(String message) {
		int command;
		do {
			command = enterFromConsole(message);
		} while(command < 0 && command > 3);
		return command;		
	}
	
	private static void sortParagraphsBySentencesAmount(String stringToSort) {
		String[] paragraphs = splitParagraphs(stringToSort);
		for (int indParagraph = 0; indParagraph < paragraphs.length; indParagraph++) {
			String[] sentencesPar = splitSentences(paragraphs[indParagraph]);
			for (int indSentence = paragraphs.length - 1; indSentence > indParagraph; indSentence--) {
				String[] sentences = splitSentences(paragraphs[indSentence]);
				if (sentencesPar.length > sentences.length) {
					swapElements(paragraphs, indParagraph, indSentence);
				}							
			}
			System.out.println("[" + paragraphs[indParagraph] + "] ");			
		}		
	}
	
	private static void sortWordsInSentencesByLength(String stringToSort) {
		String[] sentences = splitSentences(stringToSort);
		for (String sentence : sentences) {
			String[] words = splitWords(sentence);
			for (int i = 0; i < words.length; i++) {
				for (int j = words.length - 1; j > i; j--) {
					if (words[i].length() > words[j].length()) {
						swapElements(words, i, j);
					}					
				}
				System.out.print("[" + words[i] + "] ");
			}	
			System.out.println();
		}		
	}
	
	private static void sortLexemesByPattern(String stringToSort, String regex) {
		String[] words = splitWords(stringToSort);
		Pattern pattern = Pattern.compile(regex);				
		for (int i = 0; i < words.length - 1; i++) {
			for (int j = words.length - 1; j > i; j--) {
				int firstInput = countInputs(words, pattern, i);
				int secondInput = countInputs(words, pattern, j);				
				if (secondInput > firstInput) {
					swapElements(words, i, j);					
				} else if (secondInput == firstInput) {
					String[] twoWords = {words[i], words[j]};
					alphabetSort(twoWords);						
					words[i] = twoWords[0];
					words[j] = twoWords[1];
				}				
			}
			System.out.println("[" + words[i] + "] ");
		}		
	}
	
	private static int countInputs(String[] arrayToCount, Pattern pattern, int index) {
		int inputCounter = 0;
		Matcher matcher = pattern.matcher(arrayToCount[index]);
		while (matcher.find()) {
			inputCounter++;
		}
		return inputCounter;
	}
	
	private static void alphabetSort(String[] arrayToSort) {
		int counter = 0;
		for (int i = 0; i < arrayToSort.length - 1; i++) {
			if (arrayToSort[i + 1].toLowerCase().compareTo(arrayToSort[i].toLowerCase()) < 0) {
				String temp = arrayToSort[i];
				arrayToSort[i] = arrayToSort[i + 1];
				arrayToSort[i + 1] = temp;
			}
		}    	
		if (counter > 0) {
			alphabetSort(arrayToSort);
		}
    }
	
	private static void swapElements(String[] base, int index1, int index2) {
		String temp = base[index1];
		base[index1] = base[index2];
		base[index2] = temp;	
	}
	
	private static String[] splitParagraphs(String stringToSplit) {
		String regex = "\n";
		Pattern pattern = Pattern.compile(regex);
		return pattern.split(stringToSplit);		
	}
	
	private static String[] splitSentences(String stringToSplit) {
		String regex = "[!?.\n]+";
		Pattern pattern = Pattern.compile(regex);
		return pattern.split(stringToSplit);
	}
	
	private static String[] splitWords(String stringToSplit) {
		String regex = "[-.,!?\\s]+";
		Pattern pattern = Pattern.compile(regex);
		return pattern.split(stringToSplit);
	}	
}
