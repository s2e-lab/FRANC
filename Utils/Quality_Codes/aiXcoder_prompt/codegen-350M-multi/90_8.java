import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID90{
	/**
	* Add the value to the HashSet given by map.get(key), creating a new HashSet if the HashSet is null
	*/
	public static void addToSet(Map<String, HashSet<Integer>> map, String key, Integer value){
		if (map == null){
			HashSet<Integer> mySet = new HashSet<Integer>();
			mySet.add(value);
			map = new HashMap<String, HashSet<Integer>>();
			map.put(key, mySet);
		}else{
			HashSet<Integer> mySet = map.get(key);
			if (mySet == null){
				mySet = new HashSet<Integer>();
				map.put(key, mySet);
			}
			mySet.add(value);
		}

}
}