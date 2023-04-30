import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID32{
	/**
	* Returns the minimum value in an array.
	*/
	public static int min(int[] array){
			int number = array.length;
			int min = Integer.MIN_VALUE;
			for(int i=0;i< array.length;i++){
				if(array[i]>min){
					min=array[i];
				}
			}
			return min;
	}

	public static void main(String[] args){
		//create 20 integers and generate integers
      int a[] = new int[20];
}
}