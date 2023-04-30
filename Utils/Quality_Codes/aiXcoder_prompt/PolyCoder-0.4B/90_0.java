import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID90{
	/**
	* Add the value to the HashSet given by map.get(key), creating a new HashSet if the HashSet is null
	*/
	public static void addToSet(Map<String, HashSet<Integer>> map, String key, Integer value){
			if(map==null){
				return;
			}
			if(value==null){
				return;
			}
			HashSet<Integer> set = map.get(key);
			if(set==null || set.contains(value)){
				map.put(key, new HashSet<Integer>());
				map.get(key).add(value);
			}
			set.add(value);
		}

}