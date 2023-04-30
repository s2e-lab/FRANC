import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID148{
	/**
	* Swaps the elements at the specified positions in the specified list. (If the specified positions are equal, invoking this method leaves the list unchanged.)
	*/
	public static <E> void swap(List<E> list, int i, int j){
		if (i == j) return;
		Object temp = list.get(i);
		list.set(j, list.get(i));
		list.set(i, temp);
	}
	
	public static void main(String[] args) throws Exception{
		Reader in = new InputStreamReader(System.in);
		BufferedReader bin = new BufferedReader(in);
		int nTestCase = Integer.parseInt(bin.readLine());
}
}