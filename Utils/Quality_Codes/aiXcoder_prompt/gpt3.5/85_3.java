import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID85{
	/**
	* If the string passed in is not blank or null and did not end with the trailing value, then appended the trailing value to it and return the result 
	*/
	public static String appendTrailing(String str, String trailing){
			if (str != null && str.trim().length() > 0 && !str.endsWith(trailing)) {
			return str + trailing;
		} else {
			return str;
		}
	}

	/**
	* If the string passed in is not blank or null and starts with the prefix, then remove the prefix and return the result. Otherwise, return the original string.
	*/
	public static String removePrefix(String str, String prefix){
		if (str != null && str.trim().length() > 0 && str.startsWith(prefix)) {
			return str.substring(prefix.length());
		} else {
			return str;
		}
	}

	/**
	* If the string passed in is not blank or null and contains the search string, then replace the first occurrence in the string with the replacement string and return the result. Otherwise, return the original string.
	*/
	public static String replaceFirst(String str, String search, String replacement){
		if (str != null && str.trim().length() > 0 && str.contains(search)) {
			return str.replaceFirst(search, replacement);
		} else {
			return str;
		}
	}

	/**
	* If the string passed in is not blank or null and contains the search string, then replace all occurrences in the string with the replacement string and return the result. Otherwise, return the original string.
	*/
	public static String replaceAll(String str, String search, String replacement){
		if (str != null && str.trim().length() > 0 && str.contains(search)) {
			return str.replaceAll(search, replacement);
		} else {
			return str;
		}
	}

	/**
	* If the string passed in is not blank or null and is of the format "yyyyMMdd", then parse it to a date object and return it. Otherwise, return null.
	*/
	public static Date parseDate(String str){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
		try {
			Date date = sdf.parse(str);
			return date;
		} catch (ParseException e) {
			return null;
		}
	}
}