import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID90{
	/**
	* Add the value to the HashSet given by map.get(key), creating a new HashSet if the HashSet is null
	*/
	public static void addToSet(Map<String, HashSet<Integer>> map, String key, Integer value){
			for (Iterator it = map.keySet().iterator(); it.hasNext();) {
				String[] args = (String[]) it.next();
				HashSet<Integer> h = map.get(args[0]);
				if (h == null) {
					h = new HashSet<Integer>();
					map.put(args[0], h);
				}
				h.add(value);
			}
	}

	private ID90(){
		map = new TreeMap<String,HashSet<Integer>>();
	}


}