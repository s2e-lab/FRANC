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
			sb.append(',');
			for (int i = 0; i < coll.size(); i++){
				sb.append(", ").append(coll.get(i));
			}
			return sb.toString();
	}

	public static void main(String[] args) throws InterruptedException
	{
		List<String> coll = new ArrayList<String>();
			for (int i = 0; i < 1000; i++)
			{
				coll.add("a");
			}
}
}