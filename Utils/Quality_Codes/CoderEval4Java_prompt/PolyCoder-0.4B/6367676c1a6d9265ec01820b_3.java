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
		 
		int len=inString.length();
		char delimChar=' ';
		int index=0;
		while('a'<=inString.charAt(index)){
			index++;
		}
		int lastIndex=index;
		while(index<len && inString.charAt(index)!='a'){
			lastIndex=index;
			index++;
		}

}
}