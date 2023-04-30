import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID41{
	/**
	* 将map中所有的key转为大写
	*/
	public static Map<String, Object> getAllUpperCase(Map<String, Object> map){
		Map<String, Object> map1 = new LinkedHashMap<String, Object>();
		String s = (String)map.get("id");
		map1 = getAllUpperCase(map1, s);
		return map1;
	}

	/**
	* 传递字符串转为Map<字段,value>
	*/
	public static Map<String, Object> parseStringToMap(CharSequence charSequence){
		List<String> list = null;

}
}