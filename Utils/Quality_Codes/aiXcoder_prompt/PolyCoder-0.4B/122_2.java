import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID122{
	/**
	* Returns true if all entries of (all subarrays of) the input array are >= 0. Returns true if the array is non-null, but empty
	*/
	public static boolean isNonNegative(long[][] in){
		 for (int i=0;i<in.length;i++){
		if(in[i].length!=0){
			for(int j = 0;j < in[i].length;j++){
				if(in[i][j]!= 0.0){
					if(in[i][j] >= 0.0){
					return false;
				}
			}	
		}
		}
	   return true;
	}


}
}