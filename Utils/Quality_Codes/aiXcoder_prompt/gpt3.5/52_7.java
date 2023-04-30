import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID52{
	/**
	* Removes the entry with the specified key from this map if present.
	*/
	public static void remove(Map<Integer, String> mapObj, Integer key){
			mapObj.remove(key);
	}

	/**
	* Returns true if this map contains a mapping for the specified key.
	*/
	public static boolean containsKey(Map<Integer, String> mapObj, Integer key){
		return mapObj.containsKey(key);
	}

	/**
	* Returns the number of key-value mappings in this map.
	*/
	public static int size(Map<Integer, String> mapObj){
		return mapObj.size();
	}

	/**
	* Returns a collection view of the values contained in this map.
	*/
	public static Collection<String> values(Map<Integer, String> mapObj){
		return mapObj.values();
	}

	/**
	* Returns a set view of the mappings contained in this map.
	*/
	public static Set<Map.Entry<Integer, String>> entries(Map<Integer, String> mapObj){
		return mapObj.entrySet();
	}

	/**
	* Replaces the entry for the specified key only if it is currently mapped to some value.
	*/
	public static void replace(Map<Integer, String> mapObj, Integer key, String newValue){
		mapObj.replace(key, newValue);
	}

	/**
	* Associates the specified value with the specified key in this map.
	*/
	public static void put(Map<Integer, String> mapObj, Integer key, String value){
		mapObj.put(key, value);
	}

	/**
	* Returns the value to which the specified key is mapped, or null if this map contains no mapping for the key.
	*/
	public static String get(Map<Integer, String> mapObj, Integer key){
		return mapObj.get(key);
	}
}

/**
 * Main class
 */