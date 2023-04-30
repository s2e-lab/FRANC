import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID52{
	/**
	* Removes the entry with the specified key from this map if present.
	*/
	public static void remove(Map<Integer, String> mapObj, Integer key){
		 if (mapObj == null || mapObj.containsKey(key)) {
			 mapObj.remove(key);
		 } else {
			 mapObj.put(key, "");
		 }
	}

	/**
	* 
	* Removes all keys from this map.
	*/
	public static void clear(){
		Map<Integer,String> mapObj = null;
		try {
			mapObj = new HashSet();
		} catch (RuntimeException x) {
//			System.out.println (x.toString());
		}
}
}