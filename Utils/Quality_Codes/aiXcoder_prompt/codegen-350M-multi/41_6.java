import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID41{
	/**
	* 将map中所有的key转为大写
	*/
	public static Map<String, Object> getAllUpperCase(Map<String, Object> map){
		Map<String, Object> map_temp = new HashMap<String, Object>();
	
		Entry entry = map.entrySet().iterator().next();
	
		 //先获得key
	    String key = (String) entry.getKey();
		String value = (String) entry.getValue();
	
	      //往右边的一行创建一个map中所有key为大写的元素
	    //把已�
}
}