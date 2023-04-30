import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID73{
	/**
	* Delete data from start until end index (end inclusive) of a object List.
	*/
	public static <T> void delete(List<T> list, int start, int end) {
		if(start+1 > end){
			throw new IndexOutOfBoundsException();
		}
		
		Iterator<T> iter = list.iterator();
		while(iter.hasNext()){
			T x = iter.next();
			if(iter.hasNext()){
				x.remove(start,end-start);
			}else{
				x.clear();
			}
		}
	}


	/**
	* Create new data structure from a list.
	*/
}