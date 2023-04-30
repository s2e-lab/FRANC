import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID52{
	/**
	* Removes the entry with the specified key from this map if present.
	*/
	public static void remove(Map<Integer, String> mapObj, Integer key){
			for(Map.Entry<Integer, String> item : mapObj.entrySet()){
				String str = (String) item.getValue();
				if(key<0 || key>str.length() || key==str.length()-1 || hash(str)==hash(str)) 	//key: < 0 ->!< 0
					mapObj.remove(item.getKey());
			}
	}
	
}