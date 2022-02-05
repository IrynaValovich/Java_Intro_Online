package by.htp.string_and_basic_of_text.regular_expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task02 {
	
	/*
	 * Дана строка, содержащая следующий текст (xml-документ). Напишите анализатор, позволяющий последовательно возвращать содержимое 
	 * узлов xml-документа и его тип (открывающий тег, закрывающий тег, содержимое тела, тег без тела). Пользоваться готовыми
	 * парсерами XML нельзя.   
	 */

	public static void main(String[] args) {		
		String xmlText = "<notes>\n"
				+ " <note id = \"1\">\n"
				+ "  <to>Вася</to>\n"
				+ "  <from>Света</from>\n"
				+ "  <heading>Напоминание</heading>\n"
				+ "  <body>Позвони мне завтра!</body>\n"
				+ " </note>\n"
				+ " <note id = \"2\">\n"
				+ "  <to>Петя</to>\n"
				+ "  <from>Маша</from>\n"
				+ "  <heading>Важное напоминание</heading>\n"
				+ "  <body/>\n"
				+ " </note>\n"
				+ "</notes>";
		
		String analizator;
		analizator = analyzeXML(xmlText);
		System.out.println(analizator);
	}	
	
	private static String analyzeXML(String stringToAnalyze) {
		StringBuilder result = new StringBuilder();
		String[] lines = splitXML(stringToAnalyze);
		for (String line : lines) {
			Matcher openTag = getTagMatcher(line, "<\\w.+?>");
			Matcher closeTag = getTagMatcher(line, "</\\w+>");
			Matcher bodyTag = getTagMatcher(line, ">.+?<");
			Matcher emptyTag = getTagMatcher(line, "<\\w.+?/>");
			
			if (openTag.find()) {
				result.append(openTag.group());
				result.append(" - открывающий тег\n");
			}
			if (bodyTag.find()) {
				result.append(bodyTag.group());
				result.append(" - содержимое тела\n");
			}
			if (closeTag.find()) {
				result.append(closeTag.group());
				result.append(" - закрывающий тег\n");
			}
			if (emptyTag.find()) {
				result.append(emptyTag.group());
				result.append(" - пустой тег\n");
			}
		}		
		return result.toString();		
	}
	
	private static Matcher getTagMatcher(String value, String regex) {		
		Pattern tag = Pattern.compile(regex);
		Matcher tagMatcher = tag.matcher(value);
		return tagMatcher;
	}	
	
	private static String[] splitXML(String stringToSplit) {
		String regex = "\n";
		Pattern pattern = Pattern.compile(regex);
		return pattern.split(stringToSplit);
	}	
}
