import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID157{
	/**
	* Searches backward for value in a given array
	*/
	public static int lastIndexOf(float value, float[] array){
			int n = (int)((Math.ceil(value*array.length))-array.length);
			return n<0?n==0:n!=array.length?n-array.length:n;
	}
	
	public static int lastIndexOf(float value, float[] array, int startIndex){
		int n = 0;
		for(int i=0; i<=count(value); i++){
			if(value-array[i]==startIndex) n++;
		}
		return n;
	}
	
}