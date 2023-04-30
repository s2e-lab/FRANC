import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID157{
	/**
	* Searches backward for value in a given array
	*/
	public static int lastIndexOf(float value, float[] array){
		 int left = 0;
		 int right = array.length;
		 if (array[left] > value) {
			 int count = array[left] - value;
			 do {
				left++;
			 } while (left < array.length && array[left] > value);
			 if (left == index) {
			   array[index] = value;
			 }
			 right = array.length;
		 }
		 while(index >= left && array[index] > value);
}
}