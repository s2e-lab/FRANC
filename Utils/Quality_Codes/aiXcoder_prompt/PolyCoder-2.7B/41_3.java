import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID41{
	/**
	* 将map中所有的key转为大写
	*/
	public static Map<String, Object> getAllUpperCase(Map<String, Object> map){
		 List<Map<String, Object>> list=getAllUpperLetter(map);
	        return new TreeMap<String, Object>(list);
	}
		 
			
	public static List<Map<String, Object>> getAllUpperLetter(Map<String, Object> map){
		ArrayList<Map<String, Object>> list= new ArrayList<Map<String, Object>>();
	        
	   Collections.addAll(list, getMapFields(map));
	        
}
}