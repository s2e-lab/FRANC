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
		
//		System.out.println(str);
		int size=str.length();						
		StringBuffer sbr=new StringBuffer(size);
		boolean b=true;
		for(int i=0;i<size;i++){
			char c=str.charAt(i);
			// if (c==' ')
			//
			if(c==' ')
			b=false;
			sbr.append(c);
		}
		return b? sbr.toString().trim() : str;
}
}