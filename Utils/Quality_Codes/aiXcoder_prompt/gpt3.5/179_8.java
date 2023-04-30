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
				Long newVal = valMap.get(key) + integer;
				valMap.put(key,newVal);
				return newVal;
			}else{
				valMap.put(key,integer);
				return integer;
			}
		}

	/**
	* 在map中,找到最大值的key
	*/
	public static String getMaxKey(Map<String,Long> valMap){
		Long maxVal = Long.MIN_VALUE;
		String maxKey = null;
		for (Map.Entry<String,Long> entry : valMap.entrySet()) {
			String key = entry.getKey();
			Long value = entry.getValue();
			if (value.compareTo(maxVal) > 0) {
				maxVal = value;
				maxKey = key;
			}
		}
		return maxKey;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int t = Integer.parseInt(s);

		Map<String,Long> valMap = new HashMap<String,Long>();

		while(t-->0){
			String[] input = br.readLine().split(" ");
			String teamName = input[0];

			Long score = Long.parseLong(input[1])*20 
								+ Long.parseLong(input[2])*10
								+ Long.parseLong(input[3])*5
								+ Long.parseLong(input[4])*2
								+ Long.parseLong(input[5]);

			incrBy(valMap,teamName,score);
		}

		System.out.println(getMaxKey(valMap));
	}
}