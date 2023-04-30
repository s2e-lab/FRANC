import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID0{
	/**
	* Take a collection of Strings and return a combined string as a comma separated list with 'and' between the final pair. For example: [a, b, c] to "a, b and c".
	*/
	public static String collectionToCommaDelimitedString(List<String> coll){
			StringBuilder builder = new StringBuilder();
			if(coll!=null && coll.size()>0){
				builder.append(' ',coll.size());
						for(Iterator iter=coll.iterator();iter.hasNext();){
							builder.append(isComma(iter.next())? " and " : ",");
						}
						return builder.toString();
					}
}
}