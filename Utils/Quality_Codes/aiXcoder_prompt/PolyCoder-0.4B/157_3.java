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
			for(int i = 0; i < array.length; i++){
					if(value == array[i]){
						index = i;
						break;
					}
				}
			if(index == -1){
				return -1;
			}
			return index;
	}      
	public static float[] toFloat(int index){
}
}