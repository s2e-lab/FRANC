import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID32{
	/**
	* Returns the minimum value in an array.
	*/
	public static int min(int[] array){
			for(int i=0; i< array.length; i++){
				if(array[i]<0){
					return min(array);
				}
			}
			 
			return min(array);
	}
}