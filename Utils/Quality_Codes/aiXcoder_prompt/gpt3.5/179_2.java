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
	* 计算两数的平方和
	*/
	public static Long sumOfSquares(Long a, Long b){
		return a*a + b*b;
	}
	
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	Map<String,Long> freq = new HashMap<>();
	
	//读入输入
	while(sc.hasNext()){
		Long x = sc.nextLong();
		Long y = sc.nextLong();
		
		//计算平方和
		Long sumOfSquares = sumOfSquares(x,y);
		
		//将平方和存储到映射表freq中，如果已存在，则value相加
		incrBy(freq,sumOfSquares.toString(),1L);
	}
	
	//找到出现次数最多的平方和，并输出其出现次数
	Long maxCount = 0L;
	for(String key : freq.keySet()){
		Long value = freq.get(key);
		if(value > maxCount){
			maxCount = value;
		}
	}
	System.out.println(maxCount);
}
}