import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID52{
	/**
	* Removes the entry with the specified key from this map if present.
	*/
	public static void remove(Map<Integer, String> mapObj, Integer key){
		 Object keyObj =(Object) mapObj.get(key);
		 if (!(keyObj instanceof ID52)) return;
		 ID52 id52 = (ID52) mapObj.get(keyObj.toString());
		 if (id52.mapObj!=null) ((ID52) id52.mapObj).remove(keyObj);
		 
	}
		
	/**
	* Returns the value for the specified key from the map if present. Null is returned if value does not exist.
	*/
}