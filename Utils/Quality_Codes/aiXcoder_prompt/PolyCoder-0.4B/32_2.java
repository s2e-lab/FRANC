import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID32{
	/**
	* Returns the minimum value in an array.
	*/
	public static int min(int[] array){
			int min = 0;
			for(int elem : array){
				if(elem < min){min = elem;}
			}
			return min;
		}
	
	public static void main(String[] args){
		int n=args.length;
		//create an array which will hold the max value
		int[] arr = new int[n];
		//loop each element
		for(int i=0;i<n;i++){
			arr[i] = i;
		}

}
}