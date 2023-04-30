import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID179{
	/**
	* 在map中，如果key存在,则value相加；如果key 不存在，增加新的key，value
	*/
	public static Long incrBy(Map<String,Long> valMap,String key, Long integer){
		 key = key.trim();
		 Long result = integer;
		 //检查key是否存在，不存在，使用当前key
		 if(valMap.containsKey(key)){
			 result = valMap.get(key) + integer;
		 }
		 else {
			 result = valMap.put(key, integer);
		 }
		 return result;
	}
	
	public static Long getby(Map<String,Long> valMap,String key,Long integer){
		 key = key.trim();
		 //检查key是否存在
}
}