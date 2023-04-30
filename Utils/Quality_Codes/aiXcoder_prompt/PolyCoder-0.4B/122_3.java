import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID122{
	/**
	* Returns true if all entries of (all subarrays of) the input array are >= 0. Returns true if the array is non-null, but empty
	*/
	public static boolean isNonNegative(long[][] in){
			for (int i = 0; i < in.length; i++){
				if (in[i][0]!= -1) return false;
			}
			return true;
	}
	
	public static void main(String[] args){
		
		int NUM = 30;
		long[][] arr = {{10,10},{12,12},{8,8},{2,2},{0,-3}};
		
}
}