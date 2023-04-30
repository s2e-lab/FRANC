import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID31{
	/**
	* Returns the index of the first occurrence of the specified element in this list, returns -1 if the element is not found
	*/
	public int indexOf(int[] array, int element) {
			for(int i=0;i<array.length;i++) {
				if(array[i]==element)
					return i;
			}
			return -1;
	}
	/**
	* Returns the index of the last occurrence of the specified element in this list, returns -1 if the element is not found
	*/
	public int lastIndexOf(int[] array, int element) {
}
}