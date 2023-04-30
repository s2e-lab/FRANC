import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID90{
	/**
	* Add the value to the HashSet given by map.get(key), creating a new HashSet if the HashSet is null
	*/
	public static void addToSet(Map<String, HashSet<Integer>> map, String key, Integer value){
		 if(map.containsKey(key)){
			 HashSet<Integer> hset = map.get(key);
			 if(hset.contains(value)){
				 hset.add(value);
			   	return; // The key existed.
			 }else{
				 hset.add(value);
			 }
		 }
		 HashSet<Integer> h = new HashSet<Integer>();
		 h.add(value);
		 hset = map.put(key, h);
	  }

	public static void main(String[] args) {
	
}
}