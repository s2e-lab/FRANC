import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID90{
	/**
	* Add the value to the HashSet given by map.get(key), creating a new HashSet if the HashSet is null
	*/
	public static void addToSet(Map<String, HashSet<Integer>> map, String key, Integer value){
		 if(value==null)
			map.put(key, (HashSet<Integer>)0);
		 else
			map.get(key).add(value);
	}
	
	/**
	* Add the value to the HashSet given by map.get(key), creating a new HashSet if the HashSet is null
	*/
	public static void addToSet(Map<String, HashSet<Integer>> map, Long key, Integer value){
		 if(value==null)
			map.put(key, (HashSet<Integer>)0);
}
}