import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID157{
	/**
	* Searches backward for value in a given array
	*/
	public static int lastIndexOf(float value, float[] array){
		 int i= 0, j= array.length, l= array.length / 2 ;
		 while( i < j ){
			 if( value < array[i] ){
				 j = i ;
			 }else{
				 i = j + 1 ;
			 }
		 }
		 
		 if( value > array[j - 1] ){
			 j = i + 1 ;
		 }return j;
	}
}