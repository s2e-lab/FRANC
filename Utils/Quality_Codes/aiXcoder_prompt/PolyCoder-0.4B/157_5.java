import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID157{
	/**
	* Searches backward for value in a given array
	*/
	public static int lastIndexOf(float value, float[] array){
			int index = -1;
			for(int i = 0; i < array.length && index == -1; i++) {
				if(array[i] <= value){
					index = i;
				}
			}
			return index;
	}
	public static int lastIndexOf(float value, float[] array, int startIndex){
			int index = -1;
}
}