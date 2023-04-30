import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID90{
	/**
	* Add the value to the HashSet given by map.get(key), creating a new HashSet if the HashSet is null
	*/
	public static void addToSet(Map<String, HashSet<Integer>> map, String key, Integer value){
		HashSet<Integer> set = map.get(key);
		if(set == null){
			set = new HashSet<Integer>(1);
			HashSet<Integer> tmp = map.get(key);
			tmp.add(new Integer(1));
		}
		set.add(new Integer(value));
	}
	
	/**
	* Get all members of HashSet
	*/
	public static void getHashSetMembers(Map<String, HashSet<Integer>> map, String key){
}
}