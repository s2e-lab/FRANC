import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID32{
	/**
	* Returns the minimum value in an array.
	*/
	public static int min(int[] array){
		int min=array[0];
		for(int i=0;i<array.length;i++){
			if(min>array[i]){
				min=array[i];
			}
		}
		return min;
	}

	public static void main(String[] args){
		System.out.println(min(new int[]{1,2,3,3,4,5,6,7,8,9,0}));
	}
}
