import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID179{
	/**
	* 在map中，如果key存在,则value相加；如果key 不存在，增加新的key，value
	*/
	public static Long incrBy(Map<String,Long> valMap,String key, Long integer){
			if (valMap.containsKey(key)){
			Long oldValue = valMap.get(key);
			Long newValue = oldValue + integer;
			valMap.put(key, newValue);
			return newValue;
		}else{
			valMap.put(key,integer);
			return integer;
		}
	}
	
	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		Map<String, Long> valMap = new HashMap<>();
		
		// 读入测试数据
		String line;
		while ((line = br.readLine())!=null){
			String[] values = line.split(" ");
			String key = values[0];
			Long integer = Long.parseLong(values[1]);
			// 调用incrBy函数
			Long newVal = incrBy(valMap,key,integer);
			
			// 输出当前key的value和所有key的总和
			System.out.println(key+":"+newVal+" total:"+valMap.values().stream().mapToLong(Long::longValue).sum());
		}
	}
}