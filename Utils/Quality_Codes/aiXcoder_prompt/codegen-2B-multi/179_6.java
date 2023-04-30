import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID179{
	/**
	* 在map中，如果key存在,则value相加；如果key 不存在，增加新的key，value
	*/
	public static Long incrBy(Map<String,Long> valMap,String key, Long integer){
		if(valMap.containsKey(key)){
			Long value = valMap.get(key);
			value = value + integer;
			valMap.put(key,value);
		}else{
			valMap.put(key, integer);
		}
		
		return integer;
	}
	
	public static void main(String[] args){
		Map<String,Long> map = new TreeMap<String,Long>();
//		map.put("aa", 1L);//初始化
		
		//
}
}