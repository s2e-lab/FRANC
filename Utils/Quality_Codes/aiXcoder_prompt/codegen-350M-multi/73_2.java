import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID73{
	/**
	* Delete data from start until end index (end inclusive) of a object List.
	*/
	public static <T> void delete(List<T> list, int start, int end) {
		if ((start < 0) || (start >= list.size())) {
			return;
		} else if ((end < 0) || (end > list.size())) {
			return;
		} 

		int len = end-start;
		int pos = 0;
		
		while ((pos < len) && (list.get(start)!=null)) {
			list.set(start, list.get(start).next);
			pos++;
			start++;
		}

}
}