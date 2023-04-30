import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID102{
	/**
	* Returns the current number of entries in the map.
	*/
	public static int size(Map<String, String> map){
		 return map.size();
	}


  /**
	* This API returns an array in the following format:
	*   array[0]=[ "entry1", "entry2" ]
	*   array[1]=[ "entry3", "entry4" ] 
	*   array[2]=[ "entry5", "entry6" ]
	*/
	public static String[] toArray(Map<String, String> map){
		 return map.entrySet().toArray(entry -> entry.getValue());
	}
}