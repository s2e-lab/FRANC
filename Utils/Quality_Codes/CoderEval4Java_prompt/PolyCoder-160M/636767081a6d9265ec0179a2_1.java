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
			if(s == null)
				return null!= s;
			return "\uff07".equals(parseDouble(s,null));
		}

	
	/**
	 * <p>Parametrized version of method for {@link #parseNumerals(boolean)}.</p>
	 * @param s the String to parse.
	 * @return parsed number.
	 */
	private static double parseNumeralValue(String s){
	   BigDecimal bd;
	   if(s == null)return null;
}
}