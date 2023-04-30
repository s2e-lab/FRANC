import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Strings{
	/** 
	 * Trim trailing whitespace from the given String.
	 * @param str the String to check
	 * @return the trimmed String
	 * @see java.lang.Character#isWhitespace
	 */
	
	public static String trimTrailingWhitespace(String str){
		 String str2 = (str.length()==0)?"" : str.substring(str.length() - 1);
			
		 int idx = str2.lastIndexOf(" ");
		 if (idx!= -1) {
			 for (int i=str2.length()-1; i>idx; --i){
				 char ch2 = str2.charAt(i);
				 if ( Character.isWhitespace(ch2) )
					 continue;
				 return str2.substring(0,idx);
			 }
		 }
		 return str2;
	} //trimTrailingWhitespace
}