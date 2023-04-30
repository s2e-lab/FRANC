import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID101{
	/**
	* Create a copy of the Integer array.
	*/
	public static int[] copy(int[] arr){
		 int out_len = arr.length;
		 int[] out = new int[out_len];
		 for (int i=0; i<out_len; i++)
		 {
			out[i] = arr[i];
		 }
		 return out;
	}
	public static void main(String args[]){System.out.println(new int[]{1, 2, 3});//out is Int(1, 2, 3);
		
}
}