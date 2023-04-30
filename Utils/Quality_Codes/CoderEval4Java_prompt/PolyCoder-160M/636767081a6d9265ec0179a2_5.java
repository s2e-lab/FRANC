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
		 
		int len=s.length();  if(len==0) return false;
      
		 len++; if(len!=1)return false;
     
      if(!(StringHelper.isAllZeros(s))||StringHelper.isAllZeros(s.charAt(0))||s.charAt(len-1)==".")
      {
		return false;
      }
     
      return true;
	}
	
}