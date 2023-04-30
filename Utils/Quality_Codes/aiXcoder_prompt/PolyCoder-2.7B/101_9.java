import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID101{
	/**
	* Create a copy of the Integer array.
	*/
	public static int[] copy(int[] arr){
		 if(arr == null) return null;
		 int[] result = new int[arr.length];
		 for(int i=0;i<arr.length;i++){
			result[i] = arr[i];
		 }
		 return result;
	}

	public static void main(String[] args) {
		int[] numbers=new int[21];
		for(int i=0;i<21;i++){
			numbers[i]=100-i;
		}
}
}