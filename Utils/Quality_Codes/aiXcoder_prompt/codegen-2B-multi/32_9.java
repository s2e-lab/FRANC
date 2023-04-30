import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID32{
	/**
	* Returns the minimum value in an array.
	*/
	public static int min(int[] array){
		int min=-1,x;
		for(x=0;x<array.length;x++){
			if(array[x]>min){
				min=array[x];
			}
		}
		return min;
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
}
}