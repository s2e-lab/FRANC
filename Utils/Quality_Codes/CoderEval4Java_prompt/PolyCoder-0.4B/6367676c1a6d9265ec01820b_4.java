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
		 
	    int len = inString.length();
	    char c;
	    boolean isDone;
	    int lenLeft = len;
	    do{
		 char ch = inString.charAt(0);
		 if(charsToDelete.indexOf(ch) == -1) 
		 break;

	    	len--;
	    	c = inString.charAt(lenLeft--);
	    }while(lenLeft > 0);
	    
}
}