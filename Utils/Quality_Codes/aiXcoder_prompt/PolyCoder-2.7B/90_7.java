import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID90{
	/**
	* Add the value to the HashSet given by map.get(key), creating a new HashSet if the HashSet is null
	*/
	public static void addToSet(Map<String, HashSet<Integer>> map, String key, Integer value){
			if (map == null) {
				map = new HashMap<String, HashSet<Integer>>();
				map.put(key, new HashSet<Integer>());
			}
			HashMap<Integer, HashSet<Integer>> mapToClear = map.get(key);
			if (mapToClear == null) {
				map.put(key, new HashSet<Integer>());
				mapToClear = map.get(key);
			}
			mapToClear.add(value);
			return;
			// if (map.
}
}