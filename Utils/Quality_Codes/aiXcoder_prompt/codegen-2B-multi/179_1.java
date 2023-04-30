import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID179{
	/**
	* 在map中，如果key存在,则value相加；如果key 不存在，增加新的key，value
	*/
	public static Long incrBy(Map<String,Long> valMap,String key, Long integer){
		if(!valMap.containsKey(key)){
			valMap.put(key, new BigDecimal(integer).multiply(new BigDecimal(100)));
		}
		else{
			valMap.put(key, new BigDecimal(valMap.get(key)).add(new BigDecimal(integer)));
		}
		return 0l;
	}

//	*@return
//	*/
	public static void main(String[] args) throws FileNotFoundException, IOException{
}
}