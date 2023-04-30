import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID73{
	/**
	* Delete data from start until end index (end inclusive) of a object List.
	*/
	public static <T> void delete(List<T> list, int start, int end) {
		int size = end - start;

		for (int i = start; i < end; ++i) {
			list.set(i, null);
		}
		size = size - start;

		if (size > 0) {
			//Delete data from end to start index
			for (int i = end - 1; i < start; --i) {
				list.set(i, null);
			}
			size = size - start;
		}
	}

}