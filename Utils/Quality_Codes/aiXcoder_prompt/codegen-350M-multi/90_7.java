import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID90{
	/**
	* Add the value to the HashSet given by map.get(key), creating a new HashSet if the HashSet is null
	*/
	public static void addToSet(Map<String, HashSet<Integer>> map, String key, Integer value){
		HashSet<Integer> hashSet=map.get(key);
		if (hashSet==null){
			hashSet=new HashSet<Integer>();
			map.put(key, hashSet);
		}
		hashSet.add(value);
	}

	public static void main(String args[]){
		HashSet<Integer> hashSet1=new HashSet<Integer>();
		hashSet1.add(1);
		HashSet<Integer> hashSet2=new HashSet<Integer>();
}
}