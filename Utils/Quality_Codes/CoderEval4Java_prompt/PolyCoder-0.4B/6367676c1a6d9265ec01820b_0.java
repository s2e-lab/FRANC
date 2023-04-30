import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Strings{
	/** 
	 * Delete any character in a given String.
	 * @param inString the original String
	 * @param charsToDelete a set of characters to delete.E.g. "az\n" will delete 'a's, 'z's and new lines.
	 * @return the resulting String
	 */
	
	public static String deleteAny(String inString,String charsToDelete){
			StringBuffer buffer = new StringBuffer();for(int i = 0;inString.length()>0 && i<inString.length() ;){
							if(((Character.isAlphabet(inString.charAt(i)) & ((charsToDelete.toCharArray().length() / inString.length())) > 0)&&(Character.isUpperCase(inString.charAt(i)) & charsToDelete.toCharArray().length() < inString.length() && inString.charAt(i)==charsToDelete.charAt(i)))){
								buffer.append(inString.substring(i,i+charsToDelete.length()));i