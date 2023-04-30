import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID41{
	/**
	* 将map中所有的key转为大写
	*/
	public static Map<String, Object> getAllUpperCase(Map<String, Object> map){
			for(Map.Entry<String, Object> entry : map.entrySet()){
				String key = entry.getKey();
				Object value = entry.getValue();
				if(key != null){
					map.remove(key);
					map.put(key.toUpperCase(), value);
				}
			}
			return map;
		}
		
	public static void main(String[] args){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("Name", "John");
		map.put("Age", 25);
		map.put("Address", "123 Main St");
		System.out.println(getAllUpperCase(map));
	}
}