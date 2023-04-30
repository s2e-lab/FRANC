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
				valMap.put(key, valMap.get(key) + integer); // add the integer value to existing value if key already present in map
			}else{
				valMap.put(key, integer); // add new key-value pair if key is not present in map
			}
			return valMap.get(key); // return the updated value for the given key
		}

		public static void main(String[] args){
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			Map<String,Long> valMap = new HashMap<>();

			for(int i = 0; i < n; i++){
				String id = sc.next();
				Long value = sc.nextLong();
				incrBy(valMap, id, value);
			}

			for(String key : valMap.keySet()){
				System.out.println(key + " " + valMap.get(key));
			}
		}
	}