import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID90{
	/**
	* Add the value to the HashSet given by map.get(key), creating a new HashSet if the HashSet is null
	*/
	public static void addToSet(Map<String, HashSet<Integer>> map, String key, Integer value){
		 if(map==null){
			map=new HashMap<>();
		}
		HashSet<Integer> set;
		if (value == null || value == 0){
			set=new HashSet<>();
			set.add(0);
			map.put(key, set);
			return;
		}
		int num = value.intValue();
}
}