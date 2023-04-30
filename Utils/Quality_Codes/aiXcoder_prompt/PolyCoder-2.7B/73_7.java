import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID73{
	/**
	* Delete data from start until end index (end inclusive) of a object List.
	*/
	public static <T> void delete(List<T> list, int start, int end) {
		 try {
			delete(list, start, end, true);
			return;
		} catch (Exception e) {
			System.out.println("Exception caught");
			e.printStackTrace();
		}
	}

	/**
	* Delete data from start to index till the end index (end inclusive) of a string.
	* The string is taken from the list.
	*/
	public static void delete(String s, int start, int end) {	
}
}