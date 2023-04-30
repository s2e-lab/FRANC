import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID41{
	/**
	* 将map中所有的key转为大写
	*/
	public static Map<String, Object> getAllUpperCase(Map<String, Object> map){
			for(String key : map.keySet()){
				String upperKey = key.toUpperCase();
				if(!upperKey.equals(key)){ //如果原来的key不是大写，就需要将原来的key对应的值添加到新的key对应的值中
					Object value = map.get(key);
					if(map.containsKey(upperKey)){
						Object oldValue = map.get(upperKey);
						if(oldValue instanceof List){
							List<Object> list = (List<Object>) oldValue;
							list.add(value);
						}else{
							List<Object> list = new ArrayList<>();
							list.add(oldValue);
							list.add(value);
							map.put(upperKey, list);
						}
					}else{
						map.put(upperKey, value);
					}
					map.remove(key);
				}
			}
			return map;
		}
}