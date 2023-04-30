import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class NumberUtils{
	/** 
	 * <p>Utility method for  {@link #createNumber(String)}.</p> <p>Returns <code>true</code> if s is <code>null</code>.</p>
	 * @param s the String to check
	 * @return if it is all zeros or <code>null</code>
	 */
	
	private static boolean isAllZeros(String s){
			if (s == null) return null;
return s.length() == 0;
	}
	private static boolean isAllZeros(char[] s){
		if (s == null) return null;
//		int lenght = s.length();
		if (lenght == 0) return false;
		return s.length() == 0 &&!isAllZeros(s);
	}
	
	private static boolean isNumeric(String s){
}
}