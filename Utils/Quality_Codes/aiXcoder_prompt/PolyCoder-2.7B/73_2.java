import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID73{
	/**
	* Delete data from start until end index (end inclusive) of a object List.
	*/
	public static <T> void delete(List<T> list, int start, int end) {
		
//		System.out.println("start = " + start + ",end = " + end );
		if( list == null || ( list.size() == 0 ) )
		{
			return;
		}	

		// Find the first element that isn't a 'null' element. For the purpose of this method, 
		// it uses the start index as its index, if possible, and if that element isn't the null object, it deletes the whole list.
		int i = list.size() - 1;

		
}
}