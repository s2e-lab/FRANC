import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Strings{
	/** 
	 * Returns  {@code true} if the given string starts with the specified case-insensitive prefix, {@code false} otherwise.
	 * @param str the String to check
	 * @param prefix the prefix to look for
	 * @return {@code true} if the given string starts with the specified case-insensitive prefix, {@code false} otherwise.
	 * @see java.lang.String#startsWith
	 */
	
	public static boolean startsWithIgnoreCase(String str,String prefix){
		 if(StrUtils.equalsCaseInsensitive(str, prefix)){
			return true; 
		}
	 			 return StrUtils.startsWithIgnoreCase(str, prefix);
		}
	 	 

		public static String getFirstName(String str)
		{
			if(StrUtils.startsWithIgnoreCase(str, "First"))//.matches().
				return "First";
			return "";
		}
	
	
	public static String getMiddleName(String str){
		 //.matches() is not implemented
}
}