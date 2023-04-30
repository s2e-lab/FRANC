import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID122{
	/**
	* Returns true if all entries of (all subarrays of) the input array are >= 0. Returns true if the array is non-null, but empty
	*/
	public static boolean isNonNegative(long[][] in){
			boolean returnValue = true;

			for(int n=0; n<in.length; n++){
				for(int m=0; m<in[n].length; m++){
					if(in[n][m]<0){
						returnValue = false;
						break;
					}
				}
			}
		return returnValue;
	}

}