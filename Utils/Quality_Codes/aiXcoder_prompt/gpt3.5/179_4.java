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
				valMap.put(key, oldValue+integer);
				return valMap.get(key);
			}else{
				valMap.put(key, integer);
				return integer;
			}
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader inp = new BufferedReader(new InputStreamReader(System.in));
		Map<String,Long> valMap = new HashMap<String,Long>();
		String input = "";
		while((input = inp.readLine()) != null && input.length() != 0){
			String[] words = input.split("\\s+");
			String command = words[0];	
			if(command.equals("GET")){
				String key = words[1];
				if(valMap.containsKey(key)){
					System.out.println(valMap.get(key));
				}else{
					System.out.println("0");
				}
			}else if(command.equals("SET")){
				String key = words[1];
				Long integer = Long.parseLong(words[2]);
				valMap.put(key, integer);
			}else if(command.equals("INCRBY")){
				String key = words[1];
				Long integer = Long.parseLong(words[2]);
				System.out.println(incrBy(valMap,key,integer));
			}else{
				System.out.println("INVALID COMMAND");
			}
		}
    }
}