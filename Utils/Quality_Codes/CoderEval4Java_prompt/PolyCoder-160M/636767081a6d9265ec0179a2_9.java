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
		 if(s == null) return null;
		for(int i=0; i < s.length(); i++){
			if(s.charAt(i) == '0'){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		System.out.println( n);
	}
}

// @HEADER
// ***********************************************************************
//
//       