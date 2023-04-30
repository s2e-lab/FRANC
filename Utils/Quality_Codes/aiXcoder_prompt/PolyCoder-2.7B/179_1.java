import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID179{
	/**
	* 在map中，如果key存在,则value相加；如果key 不存在，增加新的key，value
	*/
	public static Long incrBy(Map<String,Long> valMap,String key, Long integer){
			String keyName = key+"";
			if(valMap.containsKey(keyName)){
				Long res = valMap.get(keyName)+integer ;
				valMap.put(keyName,res);
				return res;
			}
		
			long ret = 0;
}
}