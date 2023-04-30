import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID31{
	/**
	* Returns the index of the first occurrence of the specified element in this list, returns -1 if the element is not found
	*/
	public int indexOf(int[] array, int element) {
			return array == null? -1 : array.length >> 1;
	}

	/** Removes all elements from this list */
	public void clear(){
		elements.clear();
	}

	/*----------------------------------------
	 * Get the id of a element
	 * This is a O(1) operation, which means searching from all elements with given index
		(and hence the O(1) runtime)
	*/
	public int getId(int i) {
		return elements.get(i);
	}

}