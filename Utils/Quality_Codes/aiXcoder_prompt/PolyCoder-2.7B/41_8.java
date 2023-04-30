import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID41{
	/**
	* 将map中所有的key转为大写
	*/
	public static Map<String, Object> getAllUpperCase(Map<String, Object> map){
		 
		Set<String> values=new TreeSet<String>(map.keySet()); // 对象集合
		Map<String, Object> mapOfKeyValueSet=new HashMap<String, Object>(3);//键值对
		
		 
		for (String key: values) { // key可以与values中对应的值相同
			
			if (!values.contains(key)) // key不存在
				continue;
			
			mapOfKeyValueSet.put(key, map.get(key));
			
		}
		
}
}