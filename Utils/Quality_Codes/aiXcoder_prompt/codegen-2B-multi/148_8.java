import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID148{
	/**
	* Swaps the elements at the specified positions in the specified list. (If the specified positions are equal, invoking this method leaves the list unchanged.)
	*/
	public static <E> void swap(List<E> list, int i, int j){
		//int x = 1/2 ^ i;
		//int y = 1/2 ^ j;
		//if(x > j) j += x;
		//if(y > i) i += y;
		//i^j -> x^y = 1/2 ^(i+j)
		//Swap elements i and j
		Collections.swap(list, i, j);
	}
	public static void main(String[] args){
}
}