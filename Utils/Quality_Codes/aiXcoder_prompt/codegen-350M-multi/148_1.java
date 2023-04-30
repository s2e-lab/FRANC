import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID148{
	/**
	* Swaps the elements at the specified positions in the specified list. (If the specified positions are equal, invoking this method leaves the list unchanged.)
	*/
	public static <E> void swap(List<E> list, int i, int j){
		if( i == j){
			int temp = list.get(i);
			list.set(i, list.get(j));
			list.set(j, temp);
		}
		else if( i<j ){
			swap( list, i, j-1);
			swap( list, i+1, j);
		}
		else if( i>j) {
			swap( list, i, j+1);
			swap( list, i-1, j);
		}
	}

}