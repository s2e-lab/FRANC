import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID122{
	/**
	* Returns true if all entries of (all subarrays of) the input array are >= 0. Returns true if the array is non-null, but empty
	*/
	public static boolean isNonNegative(long[][] in){
			for(int i=0;i<in.length;i++){
				if(in[i] == null)
						return true;
			}
			return false;
	}
	
	/**
	* Computes the absolute value (in abs) of the input array.
	*/
	public static long abs(long[][] in){
		if(in == null || in.length!= in[0].length)
			return 0;
		
}
}