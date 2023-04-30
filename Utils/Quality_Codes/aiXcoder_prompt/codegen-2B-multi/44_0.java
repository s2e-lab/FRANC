import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID44{
	/**
	* 移除 map 中的 null 或者 空字符串
	*/
	public static void removeNullValue(Map<String, Object> map){
		Map<String, Object> newMap = new LinkedHashMap<String, Object>();
		Collection<String> keySet = map.keySet();
		for(String key : keySet){
			if(map.get(key)!= null){
				if(map.get(key) instanceof String)
					newMap.put(key, ((String)map.get(key)).trim());
				else
					newMap.put(key, map.get(key));
			}
		}
		map.clear();
}
}