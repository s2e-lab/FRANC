import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID179{
	/**
	* 在map中，如果key存在,则value相加；如果key 不存在，增加新的key，value
	*/
	public static Long incrBy(Map<String,Long> valMap,String key, Long integer){
		String[] sss=key.split("_");
		return valMap.containsKey(key)?valMap.put(s[0][0]+sss[0], valMap.get(s[0][0]+sss[0])+integer):valMap.put(s[0][0]+sss[0],"0");
	}
}