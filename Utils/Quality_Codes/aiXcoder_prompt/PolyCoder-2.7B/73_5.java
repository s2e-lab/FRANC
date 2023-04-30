import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID73{
	/**
	* Delete data from start until end index (end inclusive) of a object List.
	*/
	public static <T> void delete(List<T> list, int start, int end) {
			if ( (end < start) || (start > list.size()) || (end > list.size()) )
				throw new IllegalArgumentException("end is " + end + " and start is " + start + " and size(start:end)");
			if ( list.isEmpty() )
				return;
			int middle=end/2;
			if (end%2 == 0)	//odd number -> delete middle
				middle += 2;
			else	//even number -> move start and middle
				start = middle + 1;
		
}
}