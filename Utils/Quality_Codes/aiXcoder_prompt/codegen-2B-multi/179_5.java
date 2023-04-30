import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID179{
	/**
	* 在map中，如果key存在,则value相加；如果key 不存在，增加新的key，value
	*/
	public static Long incrBy(Map<String,Long> valMap,String key, Long integer){
		if(valMap.get(key) == null){
			valMap.put(key,Integer.valueOf(integer));
			return integer;
		}else{
			return valMap.get(key) + Integer.valueOf(integer);
		}
	}
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
}
}