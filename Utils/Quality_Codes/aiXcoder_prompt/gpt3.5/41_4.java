import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID41{
	/**
	* 将map中所有的key转为大写
	*/
	public static Map<String, Object> getAllUpperCase(Map<String, Object> map){
			for (String key : map.keySet()) {
				//将key转为大写
				String upperKey = key.toUpperCase();
				map.put(upperKey, map.get(key));
				map.remove(key);
			}
			return map;
		}
}