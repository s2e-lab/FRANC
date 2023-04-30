import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID90{
	/**
	* Add the value to the HashSet given by map.get(key), creating a new HashSet if the HashSet is null
	*/
	public static void addToSet(Map<String, HashSet<Integer>> map, String key, Integer value){
			if(map==null) return; // empty or null HashMap
			HashMap curMap = new HashMap(map);
			int curVal = curMap.get(key);
			
			if(curVal==null || curVal<=0){
				return; // a value was removed from the set; return an empty one.
			}

}
}