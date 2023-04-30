import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID52{
	/**
	* Removes the entry with the specified key from this map if present.
	*/
	public static void remove(Map<Integer, String> mapObj, Integer key){
			String prop = mapObj.getString(key);
			String value = mapObj.get(key);
			propertyCount.remove(prop);
			mapObj.remove(key);

			if(value == null){
				value = null;
			}
			if(mapObj.containsKey(key)){
				mapObj.remove(key);
			}
			if(value!= null && mapObj.containsKey(value)){
				mapObj.remove(value);
			}
}
}