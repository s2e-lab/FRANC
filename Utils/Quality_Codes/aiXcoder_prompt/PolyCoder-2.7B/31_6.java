import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID31{
	/**
	* Returns the index of the first occurrence of the specified element in this list, returns -1 if the element is not found
	*/
	public int indexOf(int[] array, int element) {
			for (int i = 0; i < this.size(); i++) {
				if (array[i] == element) {
					return i;
				}
			}

			// not found error: return-index
			return -1;
	}

	/**
	* Returns true if the list contains no elements.
	*/
	public boolean isEmpty() {
		return this.size() == 0;
	}

	/**
	* Returns the number of elements in this list.
	*/
}