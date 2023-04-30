import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID41{
	/**
	* 将map中所有的key转为大写
	*/
	public static Map<String, Object> getAllUpperCase(Map<String, Object> map){
		Set set = map.entrySet(); //可以看作是一度为一个键，返回一个键
		Iterator itr = set.iterator(); //返回一个键的iterator
		String k = (String) itr.next();//返回一个键的key
		set.remove(k); //不移除已经存在的key
		//System.out.println(set.
}
}