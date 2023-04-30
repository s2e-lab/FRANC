import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID31{
	/**
	* Returns the index of the first occurrence of the specified element in this list, returns -1 if the element is not found
	*/
	public int indexOf(int[] array, int element) {
		
for(int index = 0; index < array.length; index++) 
	{ 
	if(equals(array[index], element))
		return index; 
		
	}
	return -1; // not found
	}
		
	
}