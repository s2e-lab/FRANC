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
				Long oldValue = valMap.get(key);
				Long incrementedValue = oldValue + integer;
				valMap.put(key, incrementedValue);
				return incrementedValue;
			}
			else{
				valMap.put(key, integer);
				return integer;
			}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<String,Long> valMap = new HashMap<>();
		while(n-- > 0){
			String command = sc.next();
			if(command.equals("incrby")){
				String key = sc.next();
				Long integer = sc.nextLong();
				Long incrementedValue = incrBy(valMap, key, integer);
				System.out.println(incrementedValue);
			}
		}
	}
}