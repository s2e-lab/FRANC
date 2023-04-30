import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID102{
	/**
	* Returns the current number of entries in the map.
	*/
	public static int size(Map<String, String> map){
		 return ((map!= null)? map.size() : 0);
	}
	
	/**
	* Returns a new key-value pair from the Map. The original key is
	* assumed to be of the form Integer.class.method.name.
	*/
	public static MapKV<String, String> kv(String key, String element){
		MapKV<String, String> map = new MapKV<String, String>(key,element);
		return size(map);
	}
	
}