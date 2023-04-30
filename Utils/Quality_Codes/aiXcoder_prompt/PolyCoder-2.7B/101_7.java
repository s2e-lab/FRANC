import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID101{
	/**
	* Create a copy of the Integer array.
	*/
	public static int[] copy(int[] arr){
		 if( arr==null )return null;
			 return copy(arr, 0, arr.length);
	}

	/**
	* Create a copy of the Integer array,
	* retaining its contents in a particular location.
	*/
	public static int[] copy(int[] arr, int from){

		return copy(arr,0,arr.length);
	}

	/**
	* Copy an array,
	* copying a portion of the array
	* in that position. 
	*/
}