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
		
		if(str == null){
			return "";
		}
		
		String tstr = str; 
		for(int i=tstr.length()-1;i>=0;i--){
			char char_i = tstr.charAt(i);
			if(Character.isWhitespace(char_i)){
				tstr = tstr.substring(0,i+1);
			}
			else{
				break;
			}
		}
		return tstr;
	} 
	

}