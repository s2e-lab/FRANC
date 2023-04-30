import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID90{
	/**
	* Add the value to the HashSet given by map.get(key), creating a new HashSet if the HashSet is null
	*/
	public static void addToSet(Map<String, HashSet<Integer>> map, String key, Integer value){
		 HashSet<Integer> set = null;
		 try {
			set = new HashSet<Integer>();
			listPut(map, key, value);
		 } catch (NullPointerException e){
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(set==null)
			set = new HashSet<Integer>();
		set.add(value);
	}
}