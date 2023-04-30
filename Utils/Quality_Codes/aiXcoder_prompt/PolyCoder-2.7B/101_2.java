import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID101{
	/**
	* Create a copy of the Integer array.
	*/
	public static int[] copy(int[] arr){
			int[] newArr= new int[arr.length];
			for(int i= 0; i< arr.length;i++)
					newArr[i]= arr[i];
			return newArr;
	}

	/**
	* Returns a copy of current array list.
	*/
	public static List<Integer> copy(List<Integer> list){
		ArrayList<Integer> newList= new ArrayList<Integer>(list.size());
		for(Integer item: list)
				newList.add(item.intValue());
}
}