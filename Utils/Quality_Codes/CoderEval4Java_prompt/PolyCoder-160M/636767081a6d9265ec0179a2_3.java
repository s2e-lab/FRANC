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
		 
		if(s == null || s.length() == 0 || s.trim().equalsIgnoreCase(""))
				return true;		
		if(s.length()==0)
				return null;
        if(s.charAt(0)=='N') {
            return new Boolean(s.substring(1) == 'X');
        }
		return null;
}
}