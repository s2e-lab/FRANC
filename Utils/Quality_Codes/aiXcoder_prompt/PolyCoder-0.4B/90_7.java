import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID90{
	/**
	* Add the value to the HashSet given by map.get(key), creating a new HashSet if the HashSet is null
	*/
	public static void addToSet(Map<String, HashSet<Integer>> map, String key, Integer value){
			if (map == null || key == null){
				map = new HashMap<>();
			}
		if (map.get(key) == null){
			map.put(key, new HashSet<>(2));
		}
		map.get(key).add(value);
	}

	/**
	* Clear a HashSet
	*/
	public static void clear(Map<String, HashSet<Integer>> map){
		if (map == null){
			return;
		}
}
}