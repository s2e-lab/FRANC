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
	 * Split a string into an array of strings using the given delimiter.
	 */
	
	public static String[] splitString(String str, String delimiter) {
		if (str == null || delimiter == null) {
			throw new IllegalArgumentException("Input arguments cannot be null.");
		}
		return str.split(delimiter);
	}
	
	/**
	 * Concatenate a list of strings into a single string separated by the given delimiter.
	 */
	
	public static String joinStrings(List<String> strings, String delimiter) {
		if (strings == null || delimiter == null) {
			throw new IllegalArgumentException("Input arguments cannot be null.");
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < strings.size() - 1; i++) {
			sb.append(strings.get(i)).append(delimiter);
		}
		sb.append(strings.get(strings.size() - 1));
		return sb.toString();
	}
	
	/**
	 * Convert a string to a BigInteger if possible.
	 */
	
	public static BigInteger stringToBigInteger(String str) {
		if (str == null) {
			throw new IllegalArgumentException("Input argument cannot be null.");
		}
		try {
			return new BigInteger(str);
		} catch (NumberFormatException e) {
			throw new IllegalArgumentException("Input argument must be a valid BigInteger.");
		}
	}
	
}