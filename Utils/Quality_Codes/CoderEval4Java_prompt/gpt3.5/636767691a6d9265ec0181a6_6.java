import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Strings{
	/** 
	 * Split a String at the first occurrence of the delimiter. Does not include the delimiter in the result.
	 * @param toSplit the string to split
	 * @param delimiter to split the string up with
	 * @return a two element array with index 0 being before the delimiter, andindex 1 being after the delimiter (neither element includes the delimiter); or <code>null</code> if the delimiter wasn't found in the given input String
	 */
	
	public static String[] split(String toSplit,String delimiter){
			if(toSplit == null || delimiter == null){
			return null;
		}
		
		int index = toSplit.indexOf(delimiter);
		if(index == -1){
			return null;
		}
		
		String[] result = new String[2];
		result[0] = toSplit.substring(0, index);
		result[1] = toSplit.substring(index + delimiter.length());
		
		return result;
	}
}
/**
 * Example usage:
 * String toSplit = "Hello,World";
 * String delimiter = ",";
 * String[] splitResult = Strings.split(toSplit,delimiter);
 * if(splitResult != null){
 *     System.out.println("First:"+splitResult[0]);  // Prints "First:Hello"
 *     System.out.println("Second:"+splitResult[1]); // Prints "Second:World"
 * }
 */