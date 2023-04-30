import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID0{
	/**
	* Take a collection of Strings and return a combined string as a comma separated list with 'and' between the final pair. For example: [a, b, c] to "a, b and c".
	*/
	public static String collectionToCommaDelimitedString(List<String> coll){
			String finalString="and";
			boolean first=true;
			for(String s:coll){
				if(first){
					first=false;
					finalString+=s+",";
				}
				else{
					finalString=finalString+" and "+s;
					finalString+=s;
				}
			}
			return finalString;
	}
	
	
	
	public static void main(String[] args){
}
}