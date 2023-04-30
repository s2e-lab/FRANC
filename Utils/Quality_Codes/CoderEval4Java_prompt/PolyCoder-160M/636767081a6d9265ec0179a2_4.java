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
		 if(s==null || s.isEmpty()){
			 return  true;
		 } else {
			 return (s.charAt(0)=='\' ||  s.charAt(0)=='\n') && isAllZerosLong(s.substring(1, s.length()-1));
		 }
	}
	
	
   static boolean isAllZerosLong(String s){
      if(s==null || s.isEmpty()){
	   return true;
      } else {
	   return (s.charAt(0)=='\' ||