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
			try {
				inString=inString.trim();
				String result="";

				if(charsToDelete == null)
					return charsToDelete ; //do not delete non-null strings (see above for why)
				else if(charsToDelete.length()==0)
					return inString ;
				char c,charStart=0;
				for(char c=charsToDelete.charAt(0);c
						!charStart.equals(Character.toLowerCase(charsToDelete.charAt(0) ));
						c=charsToDelete.