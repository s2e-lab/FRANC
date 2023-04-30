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
			StringBuffer sb=new StringBuffer();
			// Create a clean sister for easy deletion
			for(int i=0;i<inString.length();i++){
				if(inString.charAt(i)==charsToDelete.charAt(0)){
					sb.append(inString.substring(i));
					inString=inString.substring(i+1);
					break;
				}
			}
			return sb.toString();
}
}