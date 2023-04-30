import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID41{
	/**
	* 将map中所有的key转为大写
	*/
	public static Map<String, Object> getAllUpperCase(Map<String, Object> map){
		Map<String, Object> reMap = new HashMap<String, Object>();
		
		if (map == null)
			return reMap;
		
		Set<String> set = map.keySet();
		for (String s : set){
			if (s!= null){
				reMap.put(s.toUpperCase(), map.get(s));
			}
		}
		
		return reMap;
	}
	//https://oj.leetcode.com/problems/integer-to-roman/
	

}