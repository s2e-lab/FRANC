import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID73{
	/**
	* Delete data from start until end index (end inclusive) of a object List.
	*/
	public static <T> void delete(List<T> list, int start, int end) {
		int idx = -1;
		while (idx <= end){
			idx = list.indexOf(list.get(idx));
			list.delete(idx);
		}
	}

	/**
	* Delete a list of objects from a List.
	* This is a utility function which gets passed a list of objects,
	* deletes any objects not associated with this list object.
	*/
	public static <T> void delete(Collection<T> list) {
}
}