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
				valMap.put(key, valMap.get(key)+integer);
                return valMap.get(key);
			}
			else{
				valMap.put(key, integer);
                return integer;
			}
		}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Map<String, Long> countMap = new HashMap<String, Long>();
		int n = Integer.parseInt(in.nextLine());
		for(int i=0;i<n;i++){
			String[] input = in.nextLine().split("\\s");
			String op = input[0];
			String id = input[1];
			if(op.equalsIgnoreCase("in")){
				Long count = Long.parseLong(input[2]);
				Long increment = incrBy(countMap, id, count);
				System.out.println(increment);
			}
			else{
				if(countMap.containsKey(id)){
					System.out.println(countMap.get(id));
				}
				else{
					System.out.println("NOT PRESENT");
				}
			}
		}
	}
}