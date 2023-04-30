import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID0{
	/**
	* Take a collection of Strings and return a combined string as a comma separated list with 'and' between the final pair. For example: [a, b, c] to "a, b and c".
	*/
	public static String collectionToCommaDelimitedString(List<String> coll){
		 String temp = "";
		 for(int j = 0; j < coll.size(); j++){
			temp+= j==0? "" : coll.get(j);
		 }
		 if(coll.size()>1){
			if(j == (coll.size()-1) ){
				return "";
			}
		 }
		 return temp.endsWith(",")? temp.substring(0, temp.length()-1) + "," : temp;
	}
	public static String[] combinationCommaTerminatedArrays(ArrayList<ArrayList<String>> list){


}
}