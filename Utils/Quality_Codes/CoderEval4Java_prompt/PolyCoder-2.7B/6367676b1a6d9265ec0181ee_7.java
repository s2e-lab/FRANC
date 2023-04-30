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
			if(str == null)
				return null;
			int index = str.indexOf('\n');
			int limit = index!=-1? index : str.length();
			while(index>=0){
				str = str.substring(0, index);
				index = str.indexOf('\n');
				if(index == -1)
					return str;
				if(index < limit || index > str.length()-1)
					limit = index;
			}
}
}