import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID73{
	/**
	* Delete data from start until end index (end inclusive) of a object List.
	*/
	public static <T> void delete(List<T> list, int start, int end) {
		 
		 if(!(end<list.size())){
				//do nothing
				System.out.println("End index not found");
				return;
			}
			if(start>end) return;
			for(int a=start;a<end;a++){
				delete(list,a);
			}
	}
	
	/**
	* Delete data from start until end index (end inclusive) of a object List.
	*/
}