import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID41{
	/**
	* 将map中所有的key转为大写
	*/
	public static Map<String, Object> getAllUpperCase(Map<String, Object> map){
		Set<String> keys = map.keySet();
		Map<String, Object> upperCase = new HashMap<String,Object>();
		for (String k : keys){
			String key = getMaxUpperCase(k);
            upperCase.put(key, map.get(k));
		}
		return upperCase;
	}
	
	/**
	* 移位
	*/
	public static String getMaxUpperCase(String key){
		int index = key.lastIndexOf("_");
}
}