import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID73{
	/**
	* Delete data from start until end index (end inclusive) of a object List.
	*/
	public static <T> void delete(List<T> list, int start, int end) {
		 for (final T t : list) {
	     if(t.compareTo(start) <= 0 && t.compareTo(end) >= 0) {
			  list.remove(t);
			 }
		 }
		   // list.remove(start);
	}

    public static void main(String args[]){
    	Integer[][] A = new Integer[5][5][5];
}
}