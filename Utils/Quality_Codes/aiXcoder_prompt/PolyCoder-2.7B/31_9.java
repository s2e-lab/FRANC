import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID31{
	/**
	* Returns the index of the first occurrence of the specified element in this list, returns -1 if the element is not found
	*/
	public int indexOf(int[] array, int element) {
			Arrays.sort(array);
			int low = 0, high = array.length;
			while (low < high){
				int middle = low + ((high - low)/2);
				int mid = Arrays.binarySearch(array, middle, element);
				if (mid >= 0)
					low = mid;
				else
					high = mid - 1;
			}	// end if
			return low;
	}	//	indexOf

}