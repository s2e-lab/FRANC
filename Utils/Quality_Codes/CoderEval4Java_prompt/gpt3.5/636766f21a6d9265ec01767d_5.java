import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class StringUtils{
	/** 
	 * Object to String ,when null object then null else return toString(); 
	 */
	
	public static String toString(Object object){
			if (object == null) {
			return null;
		} else {
			return object.toString();
		}
	}
	
	/**
	 * Check if a string is null or empty.
	 */
	
	public static boolean isNullOrEmpty(String str) {
		return str == null || str.isEmpty();
	}
	
	/**
	 * Join a list of strings with a delimiter.
	 */
	
	public static String join(List<String> list, String delimiter) {
		StringBuilder builder = new StringBuilder();
		boolean first = true;
		for (String s : list) {
			if (first) {
				first = false;
			} else {
				builder.append(delimiter);
			}
			builder.append(s);
		}
		return builder.toString();
	}
	
	/**
	 * Reverse a string.
	 */
	
	public static String reverse(String str) {
		return new StringBuilder(str).reverse().toString();
	}
	
	/**
	 * Convert a string to camel case.
	 */
	
	public static String toCamelCase(String str) {
		String[] words = str.split("[_\\-\\s]+");
		StringBuilder builder = new StringBuilder();
		boolean first = true;
		for (String w : words) {
			if (first) {
				builder.append(w.toLowerCase());
				first = false;
			} else {
				builder.append(Character.toUpperCase(w.charAt(0)));
				builder.append(w.substring(1).toLowerCase());
			}
		}
		return builder.toString();
	}
	
	/**
	 * Convert a string to snake case.
	 */
	
	public static String toSnakeCase(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isUpperCase(c)) {
                if (builder.length() > 0) {
                    builder.append("_");
                }
                builder.append(Character.toLowerCase(c));
            } else {
                builder.append(c);
            }
        }
        return builder.toString();
    }
}
