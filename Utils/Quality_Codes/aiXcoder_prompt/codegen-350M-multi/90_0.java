import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID90{
	/**
	* Add the value to the HashSet given by map.get(key), creating a new HashSet if the HashSet is null
	*/
	public static void addToSet(Map<String, HashSet<Integer>> map, String key, Integer value){
		HashSet<Integer> set=map.get(key);
//		if(set==null)
//			set = new HashSet<Integer>();
//		else
		
		set.add(value);
	}
	
	/**
	 * If value is not in HashSet then create a new HashSet with two entries, otherwise, store in set
	 * and add value to set.
	 */
	public static HashSet<Integer> calculateHashSet(String key, int value){
		HashSet<Integer> set=new HashSet<Integer>();
}
}