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
			if(str == null || prefix == null)
				return false;
			if(str.length() < prefix.length())
				return false;
			for(int i=0;i<prefix.length();i++){
				if(Character.toUpperCase(str.charAt(i)) != Character.toUpperCase(prefix.charAt(i))){
					return false;
				}
			}
			return true;
	}
	
	/**
	 * Returns  {@code true} if the given string ends with the specified case-insensitive suffix, {@code false} otherwise.
	 * @param str the String to check
	 * @param suffix the suffix to look for
	 * @return {@code true} if the given string ends with the specified case-insensitive suffix, {@code false} otherwise.
	 * @see java.lang.String#endsWith
	 */
	
	public static boolean endsWithIgnoreCase(String str,String suffix){
			if(str == null || suffix == null)
				return false;
			if(str.length() < suffix.length())
				return false;
			int strOffset = str.length() - suffix.length();
			for(int i=0;i<suffix.length();i++){
				if(Character.toUpperCase(str.charAt(strOffset + i)) != Character.toUpperCase(suffix.charAt(i))){
					return false;
				}
			}
			return true;
	}
}
