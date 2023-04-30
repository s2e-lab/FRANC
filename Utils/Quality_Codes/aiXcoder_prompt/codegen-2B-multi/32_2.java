import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID32{
	/**
	* Returns the minimum value in an array.
	*/
	public static int min(int[] array){
		if(array.length <= 0) {
			System.out.print("Error!");
			return 0;
		}
		int min = array[0];
		
		for(int i = 1; i < array.length; ++i){
			if(min > array[i])
				min = array[i];
		}
		return min;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
}
}