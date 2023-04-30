import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID52{
	/**
	* Removes the entry with the specified key from this map if present.
	*/
	public static void remove(Map<Integer, String> mapObj, Integer key){
			//if present, remove the key in this map
            if (mapObj == null || mapObj.get(key) == null || mapObj.get(key).isEmpty()){
         		mapObj.remove(key);
		}
	}
	
	/**
	* Returns index of the specified key in the map, or -1 if key is not found.
	*/
	public static Integer index(Map<Integer, String> mapObj, Integer key) {
    
}
}