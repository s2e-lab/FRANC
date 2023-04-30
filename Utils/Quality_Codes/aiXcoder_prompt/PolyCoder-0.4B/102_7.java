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
			boolean start = true;
			while(start){
				start = false;
				for(String s : map.keySet()){
					if(s.equals(null)) continue;
					if(s.equals("")){
						size++;
						continue;
					}
					start = true;
				}
				size++;
			}
			return size;
		}
}

