import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID41{
	/**
	* 将map中所有的key转为大写
	*/
	public static Map<String, Object> getAllUpperCase(Map<String, Object> map){
		Set<String> keySet = map.keySet();
		Map<String, Double> aMap = new HashMap<String, Double>();
		for (String key : keySet) {
			aMap.put(key.toUpperCase(), map.get(key));
		}
		return aMap;
	}

}