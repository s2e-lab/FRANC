import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID90{
	/**
	* Add the value to the HashSet given by map.get(key), creating a new HashSet if the HashSet is null
	*/
	public static void addToSet(Map<String, HashSet<Integer>> map, String key, Integer value){
			if(map.containsKey(key)){
				map.get(key).add(value);
			} else {
				HashSet<Integer> newSet = new HashSet<Integer>();
				newSet.add(value);
				map.put(key, newSet);
			}
	}
	
	public static void main (String[] args) throws java.lang.Exception{
		Map<String, HashSet<Integer>> map = new HashMap<String, HashSet<Integer>>();
		
		addToSet(map, "apple", 1);
		addToSet(map, "apple", 2);
		addToSet(map, "banana", 5);
		
		System.out.println(map.get("apple")); // prints [1, 2]
		System.out.println(map.get("banana")); // prints [5]
	}
}