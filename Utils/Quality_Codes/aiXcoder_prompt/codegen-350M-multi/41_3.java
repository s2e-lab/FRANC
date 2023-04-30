import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID41{
	/**
	* 将map中所有的key转为大写
	*/
	public static Map<String, Object> getAllUpperCase(Map<String, Object> map){
		
		Map<String, Object> result = new HashMap<String, Object>();

		for(Object key : map.keySet()){
			String strKey  = (String)map.get(key);
			strKey = strKey.toUpperCase();
			result.put(strKey, map.get(key));
		}

		return result;

	}
}