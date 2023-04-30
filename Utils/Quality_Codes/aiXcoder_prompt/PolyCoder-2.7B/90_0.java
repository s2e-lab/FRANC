import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID90{
	/**
	* Add the value to the HashSet given by map.get(key), creating a new HashSet if the HashSet is null
	*/
	public static void addToSet(Map<String, HashSet<Integer>> map, String key, Integer value){
			HashSet<Integer>set= map.get(key);
			if(set==null){
				set= new HashSet<Integer>(2);
				map.put(key, set);
			}
			set.add(value);
		}
}

/**
 * Add the value to the HashSet given by map.get(key), creating a new HashSet if the HashSet is null
*/
class MyProblem extends Problem{

	private static final long serialVersionUID = 1L;

	public MyProblem(String name){
}
}