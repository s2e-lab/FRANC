import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Strings{
	/** 
	 * Split a String at the first occurrence of the delimiter. Does not include the delimiter in the result.
	 * @param toSplit the string to split
	 * @param delimiter to split the string up with
	 * @return a two element array with index 0 being before the delimiter, andindex 1 being after the delimiter (neither element includes the delimiter); or <code>null</code> if the delimiter wasn't found in the given input String
	 */
	
	public static String[] split(String toSplit,String delimiter){
			String[] results = new String[2];
		int delimiterIndex = toSplit.indexOf(delimiter);
		if(delimiterIndex != -1){
			results[0] = toSplit.substring(0, delimiterIndex);
			results[1] = toSplit.substring(delimiterIndex + delimiter.length());
			return results;
		}
		else{
			return null;
		}
	}
}