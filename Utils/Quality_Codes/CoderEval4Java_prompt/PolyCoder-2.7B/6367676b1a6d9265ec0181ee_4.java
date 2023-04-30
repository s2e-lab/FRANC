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
		 int offset = str.length();
		  //the number of chars beyond the first whitespace characters
		 final int n = str.length();
		 if( n > 0 ){
			 //we are at whitespace, trim the trailing whitespace
			 while( offset >= n + 1 && space1(str.charAt(n-1)) &&!space1(str.charAt(offset	-n)) ){
				 String tstr =  String.valueOf(str.charAt(offset));
				 str = str.substring(0, offset - 1);
	       }
		  }

}
}