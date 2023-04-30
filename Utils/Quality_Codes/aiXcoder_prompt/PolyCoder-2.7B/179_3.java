import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID179{
	/**
	* 在map中，如果key存在,则value相加；如果key 不存在，增加新的key，value
	*/
	public static Long incrBy(Map<String,Long> valMap,String key, Long integer){
		 
	    if(valMap.containsKey(key))
	    	return( valMap.get( key) + integer);
	    else 
	    	return(add(valMap,key,integer));

	}
	
	
	public static Map<String,Long> incrMap(
		Map<String,Long> valMap,  
    	String key, 
    	Long integer) 
	{

}
}