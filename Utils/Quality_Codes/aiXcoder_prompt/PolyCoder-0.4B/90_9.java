import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID90{
	/**
	* Add the value to the HashSet given by map.get(key), creating a new HashSet if the HashSet is null
	*/
	public static void addToSet(Map<String, HashSet<Integer>> map, String key, Integer value){
			if (map.get(key) == null)  {
				map.put(key, new HashSet<>());
			}
			map.get(key).add(value);
	}
	/**
	* Remove the value from the Set given by map.get(key), creating a new HashSet if the HashSet is null
	*/
	public static void removeFromSet(Map<String, HashSet<Integer>> map, String key, Integer value){
}
}