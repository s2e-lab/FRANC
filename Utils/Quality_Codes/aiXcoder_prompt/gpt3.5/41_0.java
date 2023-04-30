import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID41{
	/**
	* 将map中所有的key转为大写
	*/
	public static Map<String, Object> getAllUpperCase(Map<String, Object> map){
			for (Map.Entry<String, Object> entry : map.entrySet()) {
				String key = entry.getKey();
				String upperKey = key.toUpperCase();
				Object value = entry.getValue();
				map.remove(key);
				map.put(upperKey, value);
			}
			return map;
		}
		
		public static void main(String[] args){
			Map<String, Object> testMap = new HashMap<>();
			testMap.put("name", "John");
			testMap.put("age", 25);
			testMap.put("gender", "male");
			testMap.put("address", "123 Main St");

			Map<String, Object> result = getAllUpperCase(testMap);

			//Output the modified map
			for (Map.Entry<String, Object> entry : result.entrySet()) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}
		}
	}