import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID90{
	/**
	* Add the value to the HashSet given by map.get(key), creating a new HashSet if the HashSet is null
	*/
	public static void addToSet(Map<String, HashSet<Integer>> map, String key, Integer value){
		HashSet<Integer> set;
		set = map.get(key);
		if(set==null){
			set = new HashSet<Integer>();
			map.put(key, set);
//			System.out.println(key+" has not been added");
		}
		set.add(value);
	}

	public static void main(String args[]) throws IOException{

		HashMap<String,HashSet<Integer>> map = new HashMap<String,HashSet<Integer>>();
}
}