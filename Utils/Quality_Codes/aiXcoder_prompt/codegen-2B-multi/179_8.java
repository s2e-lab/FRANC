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
			valMap.put(key,valMap.get(key) + integer);
		}else{
			valMap.put(key,integer);
		}
		return valMap.get(key);
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
		String[] longStrings = scanner.readLine().split(" ");
		
}
}