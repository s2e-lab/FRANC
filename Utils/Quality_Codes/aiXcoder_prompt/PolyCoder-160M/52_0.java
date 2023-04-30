import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID52{
	/**
	* Removes the entry with the specified key from this map if present.
	*/
	public static void remove(Map<Integer, String> mapObj, Integer key){
		 Object o = mapObj.remove(key);
//		 Debug.out("map :" + mapObj + ",key :" + key + ",o:" + o);
		 if (o == null ||!o.equals(key)) return;
	}
}
