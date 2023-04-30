import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID0{
	/**
	* Take a collection of Strings and return a combined string as a comma separated list with 'and' between the final pair. For example: [a, b, c] to "a, b and c".
	*/
	public static String collectionToCommaDelimitedString(List<String> coll){
		 List<String> list = new ArrayList();
		if(null == coll){
			return "";
		}
		list.addAll(Collections.list(coll));

		Collections.sort(list);

		String result = "";
		result = " and " + list.toString();
		return result;
	}
	

	public static String getIntegerLiteral(int value){
}
}