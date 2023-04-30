import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID179{
	/**
	* 在map中，如果key存在,则value相加；如果key 不存在，增加新的key，value
	*/
	public static Long incrBy(Map<String,Long> valMap,String key, Long integer){
		 Hashtable<String,Long> tmp=new Hashtable<String,Long>();
		 tmp.put(key, integer);
//		 System.out.println( tmp.toString());
		 Enumeration<Map.Entry<String,Long>> ee = valMap.entrySet().iterator();
}
}