import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID179{
	/**
	* 在map中，如果key存在,则value相加；如果key 不存在，增加新的key，value
	*/
	public static Long incrBy(Map<String,Long> valMap,String key, Long integer){
		 return valMap.get(key) + integer;
	}

	/**
	* 根据map中，如果key 不存在,增加
	*/
	public static Long incr2(Map<String,Long> map,Long integer){

		Long cur = map.get(INTEGER_KEY);
		map.put(INTEGER_KEY,(cur==null? null :
			integer)+increment(map, integer, cur));

		return integer;
	}

}