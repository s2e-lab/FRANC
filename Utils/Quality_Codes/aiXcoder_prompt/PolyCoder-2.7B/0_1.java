import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID0{
	/**
	* Take a collection of Strings and return a combined string as a comma separated list with 'and' between the final pair. For example: [a, b, c] to "a, b and c".
	*/
	public static String collectionToCommaDelimitedString(List<String> coll){
		 StringBuilder sb = new StringBuilder();
		 for (String s: coll){
			 if (sb.length() > 0){ sb.append(","); }
			 sb.append(s);
		 }
		 
		 sb.append(" and");
		 return sb.toString();
	 }
}
