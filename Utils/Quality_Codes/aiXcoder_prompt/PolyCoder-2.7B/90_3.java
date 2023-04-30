import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID90{
	/**
	* Add the value to the HashSet given by map.get(key), creating a new HashSet if the HashSet is null
	*/
	public static void addToSet(Map<String, HashSet<Integer>> map, String key, Integer value){
		 if (map == null)
			 map = new HashMap<String, HashSet<Integer>>();
		 if (map.containsKey(key))
			Collections.synchronizedList(map.get(key));
		 if (map.containsKey(key))
			 map.get(key).add(value);
		 else
			 map.put(key, new LinkedList<Integer>(Arrays.asList(value)));
	}
}