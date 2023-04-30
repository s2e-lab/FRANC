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
		 if(s!=null){
			int l=s.length();
			for(int i=0;i<l;i++){
				if(s.charAt(i)!='\0') return false;
			}
			return true;
		} else{
			return false;
		}
	}
	
}