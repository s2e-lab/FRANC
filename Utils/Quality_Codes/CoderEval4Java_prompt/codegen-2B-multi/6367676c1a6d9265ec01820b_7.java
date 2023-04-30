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
		StringBuffer buf = new StringBuffer(inString);
		char[] inArr = inString.toCharArray();
		for (int idx = 0; idx < inArr.length; idx++) {
			if(charsToDelete.indexOf(inArr[idx])>=0){
				continue;
			}
			buf.append(inArr[idx]);
		}
		return buf.toString();
	}

    public static void printDna1(String str) throws FileNotFoundException{
}
}