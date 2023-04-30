import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID179{
	/**
	* 在map中，如果key存在,则value相加；如果key 不存在，增加新的key，value
	*/
	public static Long incrBy(Map<String,Long> valMap,String key, Long integer){
		 return increment(valMap,key,1,null,integer);
	}
	
	public static long incr(Map<String,Long> valMap,Map<String,Double> oldValueMap,Long integer,String newv){
		Long oldInteger = oldValueMap.containsKey(newv)?  oldValueMap.get(newv) : null;
		Long newInteger = valMap.get(newv);
		
}
}