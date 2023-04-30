import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID90{
	/**
	* Add the value to the HashSet given by map.get(key), creating a new HashSet if the HashSet is null
	*/
	public static void addToSet(Map<String, HashSet<Integer>> map, String key, Integer value){
			if(!map.containsKey(key)){ //if the key does not exist in the map, create a new HashSet and add the value to it
				HashSet<Integer> set = new HashSet<Integer>();
				set.add(value);
				map.put(key, set);
			}
			else{ //if the key already exists in the map, retrieve the existing HashSet and add the value to it
				HashSet<Integer> set = map.get(key);
				set.add(value);
			}
		}
		
		public static void main(String[] args){
			Map<String, HashSet<Integer>> map = new HashMap<String, HashSet<Integer>>(); //create a new HashMap to store the key-value pairs
			//test the addToSet method
			addToSet(map, "key1", 1);
			addToSet(map, "key2", 2);
			addToSet(map, "key1", 3);
			addToSet(map, "key3", 4);
			
			//print the contents of the HashMap
			for(String key : map.keySet()){
				System.out.print(key + ": ");
				HashSet<Integer> set = map.get(key);
				for(Integer value : set){
					System.out.print(value + " ");
				}
				System.out.println();
			}
		}
}