package by.htp.ac_task03.validator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {	
		
	public static String validateStringParam(String name) {		
		Pattern pattern = Pattern.compile("^[А-ЯЁ][а-яё]+$");
		Matcher matcher = pattern.matcher(name);
		if (!matcher.matches()) {
			return "wrong format";
		} else {
			return name;
		}		
	}	
	
	public static int validateIntParam(int param) {
		
		if (param < 0) {			
			return Math.abs(param);
		}
		return param;		
	}
}
