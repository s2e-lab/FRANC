import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID52{
	/**
	* Removes the entry with the specified key from this map if present.
	*/
	public static void remove(Map<Integer, String> mapObj, Integer key){
			Iterator iter = mapObj.entrySet().iterator();
			while (iter.hasNext()){
				Map.Entry entry = (Map.Entry) iter.next();
				if(key == entry.getKey()){
					mapObj.remove(entry.getKey());
					return;
				}
			}
	}

	
}