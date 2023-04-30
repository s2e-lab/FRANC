import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID122{
	/**
	* Returns true if all entries of (all subarrays of) the input array are >= 0. Returns true if the array is non-null, but empty
	*/
	public static boolean isNonNegative(long[][] in){
			if(null == in || in.length==0){
				return false;
			}
			if(in[0].length!=in.length){
				return false;
			}
			//              is non-negative [ 1 :   0.. 1 ], is there a good type to test them : Arrays.stream(in.clone()) ->
}
}