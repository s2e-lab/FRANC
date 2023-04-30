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
		for (Map.Entry<String, Object> entry : map.entrySet()) {
			String key = entry.getKey().toUpperCase();
			Object value = entry.getValue();
			result.put(key, value);
		}
		return result;
	}
}