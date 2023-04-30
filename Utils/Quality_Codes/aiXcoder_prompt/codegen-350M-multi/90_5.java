import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID90{
	/**
	* Add the value to the HashSet given by map.get(key), creating a new HashSet if the HashSet is null
	*/
	public static void addToSet(Map<String, HashSet<Integer>> map, String key, Integer value){
		HashSet<Integer> newSet = map.get(key);
		if(newSet==null){
			newSet = new HashSet<Integer>();
			map.put(key, newSet);
		}
		newSet.add(value);
	}
	
	/**
	 * A method to create an ArrayList from the HashSet in the Map<String, HashSet<Integer>> parameter
	 */
	public static ArrayList<Integer> toArrayList(Map<String, HashSet<Integer>> map){
}
}