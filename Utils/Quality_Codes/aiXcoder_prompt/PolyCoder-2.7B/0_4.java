import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID0{
	/**
	* Take a collection of Strings and return a combined string as a comma separated list with 'and' between the final pair. For example: [a, b, c] to "a, b and c".
	*/
	public static String collectionToCommaDelimitedString(List<String> coll){
			String s="";
			int size=coll.size();
			for (int j =0; j<size; j++)
				s +=coll.get(j)+"(";
			return(s);
		
	}
			
			/*return collectionToCommaDelimitedString(s);*/
	}
	
			/*
			
	*/

		