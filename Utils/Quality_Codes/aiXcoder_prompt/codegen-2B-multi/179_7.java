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
			Long preVal=(Long)valMap.get(key);
			Long nextVal=preVal+integer;
			valMap.put(key,nextVal);
			return nextVal;
		}
		else{
			valMap.put(key,integer);
			return integer;
		}
	}

	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		PrintWriter cout=new PrintWriter(System.out);

}
}