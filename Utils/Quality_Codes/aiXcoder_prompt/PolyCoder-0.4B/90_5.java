import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID90{
	/**
	* Add the value to the HashSet given by map.get(key), creating a new HashSet if the HashSet is null
	*/
	public static void addToSet(Map<String, HashSet<Integer>> map, String key, Integer value){
			ArrayList<Integer> list = new ArrayList<Integer>();
			if (map.get(key) == null) {
				list.add(value);
			} else {
				list.add(value);
				map.get(key).add(value);
			}
			map.put(key, list);
	}

	/**
	* Get the value of a Map
	*/
	public static Integer get(Map<String, HashSet<Integer>> map, String key){
}
}