import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID90{
	/**
	* Add the value to the HashSet given by map.get(key), creating a new HashSet if the HashSet is null
	*/
	public static void addToSet(Map<String, HashSet<Integer>> map, String key, Integer value){
			for (int index = map.size(); index > 0; index--) {
				if (key+"."+index < map.size())
					break;
			}
			setMap(map, Integer.parseInt(key+value.toString()));
	}
	
	/**
	* Adds all the values from the given range (ie. from [0, size).
	*/
	public static void addToSet(Map<String, HashSet<Integer>> map, String key, int start, int end) {
}
}