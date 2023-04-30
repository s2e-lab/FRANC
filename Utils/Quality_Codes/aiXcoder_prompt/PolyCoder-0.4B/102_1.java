import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID102{
	/**
	* Returns the current number of entries in the map.
	*/
	public static int size(Map<String, String> map){
			int size = 0;
			for(String key: map.keySet()){
				if(map.get(key)!= null){
					size++;
				}
			}
			return size;
	}


	public static int getCount(Map<String, String> map){
		int count = 0;
		for(String key: map.keySet()){
			if(map.get(key).equals("")){
				count++;
			}
		}
		return count;
	}
}