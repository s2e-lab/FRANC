import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID157{
	/**
	* Searches backward for value in a given array
	*/
	public static int lastIndexOf(float value, float[] array){
			return lastIndexOf(value, array, 0, array.length);
	}
	public static int lastIndexOf(int value, float array[], int fromIndex, int toIndex){
		int count = 0;
		
		if(value < fromIndex){
			return -1;
		}
		if(toIndex > fromIndex){
			return -1;
		}
		if(fromIndex >= toIndex){
			return count;
		}
			
}
}