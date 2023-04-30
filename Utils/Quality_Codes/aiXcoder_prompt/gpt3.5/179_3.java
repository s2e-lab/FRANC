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
            valMap.put(key, newValue); 
            return newValue; 
        }else{ 
            valMap.put(key, integer); 
            return integer; 
        } 
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Map<String,Long> valMap = new HashMap<String,Long>();
		int n = sc.nextInt();
		sc.nextLine(); //读取回车，避免下一次读取出错
		for(int i=0;i<n;i++){
			String[] inputs = sc.nextLine().split(" "); //读取一行数据，并以空格为分隔符分开
			String op = inputs[0];
			String key = inputs[1];
			Long value = Long.parseLong(inputs[2]);
			if(op.equals("add")){
				incrBy(valMap, key, value);
			}else if(op.equals("del")){
				if(valMap.containsKey(key)){
					valMap.remove(key);
				}
			}else if(op.equals("qry")){
				System.out.println(valMap.containsKey(key) ? valMap.get(key) : 0);
			}
		}
	}
}