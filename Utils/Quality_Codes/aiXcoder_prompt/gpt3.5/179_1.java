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
				Long newValue = oldValue + integer;
				valMap.put(key,newValue);
				return newValue;
			}else{
				valMap.put(key,integer);
				return integer;
			}
		}

	/**
	* 在map中查找最大value所对应的key，如果存在多个最大值，则返回其中任意一个
	*/
	public static String findMaxKey(Map<String,Long> valMap){
		Long maxVal = Long.MIN_VALUE;
		String maxKey = "";
		for(String key : valMap.keySet()){
			Long value = valMap.get(key);
			if(value > maxVal){
				maxVal = value;
				maxKey = key;
			}
		}
		return maxKey;
	}

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;

		Map<String,Long> valMap = new HashMap<String,Long>();
		while((line = br.readLine()) != null){
			String[] words = line.trim().split(" ");
			for(String word : words){
				if(word.length() == 0) continue;
				Long value = incrBy(valMap,word.toLowerCase(),1L);
			}
		}

		String maxKey = findMaxKey(valMap);
		System.out.println(maxKey + " " + valMap.get(maxKey));
	}
}