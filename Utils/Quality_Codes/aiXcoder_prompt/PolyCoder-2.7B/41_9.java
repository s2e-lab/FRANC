import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID41{
	/**
	* 将map中所有的key转为大写
	*/
	public static Map<String, Object> getAllUpperCase(Map<String, Object> map){
			Set<Entry<String,Object>> entrys = map.entrySet();
			LinkedHashMap<String, Object> listMap = new LinkedHashMap<>();
			for(Entry<String,Object> entry : entrys)
				listMap.put(entry.getKey().toLowerCase(), entry.getValue());
			return listMap;
	}
	public static Set<String> getAllUpperCase(Set<String> set){
			Set<String> setCopy = new LinkedHashSet<>();
}
}