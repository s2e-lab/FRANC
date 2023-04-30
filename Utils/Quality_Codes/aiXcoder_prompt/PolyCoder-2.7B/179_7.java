import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID179{
	/**
	* 在map中，如果key存在,则value相加；如果key 不存在，增加新的key，value
	*/
	public static Long incrBy(Map<String,Long> valMap,String key, Long integer){
			if(key==null){return 0l;}
			if(valMap.containsKey(key)){
				if(valMap.get(key).longValue() == integer.longValue()){return 0l;}//这两个key相等的value已经存在
				valMap.put(key, valMap.get(key).longValue() + integer.longValue());
				return valMap.get(key).longValue();//当前key相同但value不为整数
			}
			return integer.longValue();
	}
	
}