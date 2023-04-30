import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID102{
	/**
	* Returns the current number of entries in the map.
	*/
	public static int size(Map<String, String> map){
			int size =0;
			for(MapEntry value: map.entrySet()){
				size+=length(value);
			}
			return size;
	}
}