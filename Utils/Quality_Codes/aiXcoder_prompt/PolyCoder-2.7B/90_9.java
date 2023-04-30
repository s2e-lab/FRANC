import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID90{
	/**
	* Add the value to the HashSet given by map.get(key), creating a new HashSet if the HashSet is null
	*/
	public static void addToSet(Map<String, HashSet<Integer>> map, String key, Integer value){
		 if(map==null) return;
		 HashSet<Integer> newList=new HashSet<Integer>();
		 for(int i=0; i<map.size(); i++){
		 if(map.get(key).add(pairIntToInt(i, value)))
		 newList.add(i);
		  }
		 if(map==newList) map.put(key, newList);
}
}