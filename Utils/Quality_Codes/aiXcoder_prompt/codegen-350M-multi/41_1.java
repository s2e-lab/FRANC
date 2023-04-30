import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID41{
	/**
	* 将map中所有的key转为大写
	*/
	public static Map<String, Object> getAllUpperCase(Map<String, Object> map){
		Map<String, Object> map1 = new HashMap<>();
		map1.put("key", "A");
		map1.put("key1", "aa");
		map1.put("key2", "aaa");
		
		map1.put("key1", "Aaaa");
		map1.put("key2", "aAa");
		map1.put("key3", "aaaa");
		
		return map1;
	}
}
