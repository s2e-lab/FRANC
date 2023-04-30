import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID31{
	/**
	* Returns the index of the first occurrence of the specified element in this list, returns -1 if the element is not found
	*/
	public int indexOf(int[] array, int element) {
			if (array==null || array.length<=1) {
				return -1;
			}
			for (int i = 0; i<array.length; i++) {
				if (array[i]==element) {
					return i;
				}
			}
			return -1;
	}

	/**
	* Returns the position of the specified element in this list, or -1 if the element is not present or is not in this list
	*/
}