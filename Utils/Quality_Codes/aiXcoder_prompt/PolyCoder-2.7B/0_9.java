import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID0{
	/**
	* Take a collection of Strings and return a combined string as a comma separated list with 'and' between the final pair. For example: [a, b, c] to "a, b and c".
	*/
	public static String collectionToCommaDelimitedString(List<String> coll){
		 if (coll == null || coll.size() < 1) return "";
		 if (coll.size() == 1){
			 return coll.get(0);
		  }
		  List<String> newColl = new Vector<String>();
	  String temp = "";
	  for (int i = 0; i < coll.size(); i++) {  
	  newColl.add(coll.get(i));
	  temp = temp + " or ";
	  }
	  return temp;
	  
	}

	public static void main(String args[]){
}
}