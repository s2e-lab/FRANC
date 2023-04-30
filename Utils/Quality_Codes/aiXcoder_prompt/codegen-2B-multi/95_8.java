import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID95{
	/**
	* Compare two java objects for equality.
	*/
	public static boolean equals(Object o1, Object o2){
		if (o1 == null && o2!= null || o1!= null && o2 == null) {
			return false;
		}
		if (o1 == null && o2 == null) {
			return true;
		}
		return o1.equals(o2);
	}
	
	public static void swap(int a[], int b[]){
		int temp = a[0];
		a[0] = a[1];
		a[1] = temp;
		
		temp = b[0];
		
}
}