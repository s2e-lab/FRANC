import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID52{
	/**
	* Removes the entry with the specified key from this map if present.
	*/
	public static void remove(Map<Integer, String> mapObj, Integer key){
			remove(mapObj, key, true);
	}
	private static void remove(Map<Integer, String> mapObj, Integer key){
		if(!mapObj.containsKey(key)) remove(mapObj, key);
	}
}