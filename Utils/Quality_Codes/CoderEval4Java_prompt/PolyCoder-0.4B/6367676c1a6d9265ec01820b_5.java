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
			if(inString == null){
				return null;
			}
		
			if(inString.length()==0){
				inString = inString.replaceAll(" ", "");
			}
		String s = inString.replace(Character.toString(charsToDelete), "");
		//System.out.println("String:"+s);
		//System.out.println(inString);
		return s;
	}
}