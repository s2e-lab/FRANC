import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID90{
	/**
	* Add the value to the HashSet given by map.get(key), creating a new HashSet if the HashSet is null
	*/
	public static void addToSet(Map<String, HashSet<Integer>> map, String key, Integer value){
		if(!map.containsKey(key)){
			HashSet<Integer> s = new HashSet<Integer>(1);
			s.add(value);
			map.put(key, s);
		}
	}

	public static void main(String[] args){
		Map<String, HashSet<Integer>> map = new HashMap<String, HashSet<Integer>>();
		addToSet(map, "one", 1);
		addToSet(map, "one", 2);
		addToSet(map, "a", 1);
}
}