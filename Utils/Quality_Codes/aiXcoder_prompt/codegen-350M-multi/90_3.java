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
			HashSet<Integer> hashSet = map.get(key);
			
			if(hashSet!= null){
				hashSet.offer(value);
			} else{
				HashSet<Integer> mapCounter = new HashSet<Integer>();
				mapCounter.add(value);
				map.put(key, mapCounter);
			}
		}
	}
	
	/**
	* Return the Set found at the given key
	*/
}