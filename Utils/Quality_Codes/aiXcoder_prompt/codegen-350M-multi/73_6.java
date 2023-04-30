import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID73{
	/**
	* Delete data from start until end index (end inclusive) of a object List.
	*/
	public static <T> void delete(List<T> list, int start, int end) {
		if (start > end) {
			return;
		}

		while (end % 2 == 1){
			list.remove((T)list.get(--end));
		}
	}

	/**
	* Compares objects using the ID1 algorithm.  Compares each object using a
	* binary search algorithm.  If the objects contain equivalent values, it
	* returns true.
	*/
	static <T> boolean equals(T a, T b) {
}
}