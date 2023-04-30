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
			}else{
				valMap.put(key, integer);
			}
			return valMap.get(key);
	}
	
	public static void main(String[] args) throws Exception{		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		
		Map<String,Long> valMap = new HashMap<String,Long>();
		
		String line = "";
		while((line=br.readLine())!=null){
			String[] tokens = line.split(" ");
			Long val = Long.parseLong(tokens[1]);
			incrBy(valMap, tokens[0], val);
		}
		
		for(Map.Entry<String,Long> entry : valMap.entrySet()){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		br.close();
	}
}