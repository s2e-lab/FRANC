import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID90{
	/**
	* Add the value to the HashSet given by map.get(key), creating a new HashSet if the HashSet is null
	*/
	public static void addToSet(Map<String, HashSet<Integer>> map, String key, Integer value){
			if(key==null){
				return;
			}
			if(!map.containsKey(key)){
				setOfKeys.add(key);
				map.put(key, new HashSet<Integer>(3));
			}
			map.get(key).add(value);
			if(map.get(key).subList(1, map.get(key).size()).size() >= 3){
				map.put(key, new HashSet<Integer>(map.get(key)));
			}
	}

}