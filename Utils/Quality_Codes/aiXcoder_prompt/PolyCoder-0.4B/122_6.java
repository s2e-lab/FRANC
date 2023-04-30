import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID122{
	/**
	* Returns true if all entries of (all subarrays of) the input array are >= 0. Returns true if the array is non-null, but empty
	*/
	public static boolean isNonNegative(long[][] in){
		 if(in==null) return false;
		if(in.length<1) return true;

		Arrays.sort(in);
		return in[0].length==in[0].length;
	}
	public static boolean isNonPositive(ID122 array){
		return array.length>0;
	}
	
	public static String toCommaSeparatedString(int...integers){
			if (integers.length ==0) return "";
 		
			// make a single string out of the values from each integer
			
}
}