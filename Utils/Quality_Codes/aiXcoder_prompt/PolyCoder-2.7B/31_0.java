import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID31{
	/**
	* Returns the index of the first occurrence of the specified element in this list, returns -1 if the element is not found
	*/
	public int indexOf(int[] array, int element) {
			int i = 0;
		if(array == null) return -1;
		int length = array.length;
		int[] newArray = new int[length];
		while(i < length){
			if(element == array[i]){
				return i;
			}
			i++;
		}
		return -1;
	}

	/**
	* Returns the index of the first occurrence of the specified element in this list, returns -1 if the element is not found
	*/
}