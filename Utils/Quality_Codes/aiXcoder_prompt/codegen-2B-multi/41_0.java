import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID41{
	/**
	* 将map中所有的key转为大写
	*/
	public static Map<String, Object> getAllUpperCase(Map<String, Object> map){
		Map<String, Object> mapUpperCase = new HashMap<String, Object>();
		for(String key : map.keySet()){
			if(!map.get(key).equals("")){
				String val = (String) map.get(key);
				mapUpperCase.put(key.toUpperCase(), val);
			}
		}
		return mapUpperCase;
	}
	public static void main(String [] args){
}
}