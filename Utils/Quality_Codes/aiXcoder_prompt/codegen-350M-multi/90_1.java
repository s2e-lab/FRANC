import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID90{
	/**
	* Add the value to the HashSet given by map.get(key), creating a new HashSet if the HashSet is null
	*/
	public static void addToSet(Map<String, HashSet<Integer>> map, String key, Integer value){
		if (map.get(key) == null){
			HashSet<Integer> newSet = new HashSet<Integer>();
			newSet.add(value);
			map.put(key, newSet);
		}
	}
	
	/**
	* Get the value from HashSet given by map.get(key)
	*/
	public static Boolean add_valueToSet(Map<String, HashSet<Integer>> map, String key, Integer value){
		Boolean val = null;
}
}