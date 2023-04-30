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
			if(s==null){return null;}
			if(s.length()==0){return null;}
			if(s.length()==0 && s.length()>0){
				if(0!=(Integer.MIN_VALUE & s.charAt(0))){
					return null;
				}
			}else if(!s.length()){
				return null;
			}
}
}