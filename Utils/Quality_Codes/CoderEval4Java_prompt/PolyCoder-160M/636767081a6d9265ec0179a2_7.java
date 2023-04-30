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
			if (s == null) return null==s;		
		if (s.equals("0") || s.equals("x0123456789")) return null==s;//null==s;
		if (s.startsWith("0x")) return null==s;
		if (s.startsWith("-0") || s.equals("-x0123456789")) return null==s;//null==s;
        if (s.startsWith("-0x")) return null==s;
        return s.equals("0");	
	}
	
	
}