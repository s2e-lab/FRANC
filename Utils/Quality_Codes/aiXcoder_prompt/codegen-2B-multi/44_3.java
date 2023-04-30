import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID44{
	/**
	* 移除 map 中的 null 或者 空字符串
	*/
	public static void removeNullValue(Map<String, Object> map){
		Iterator<String> iter = map.keySet().iterator();
		while(iter.hasNext()){
            String key = iter.next();
            if(null == map.get(key) || "".equals(map.get(key).toString().trim())){
                iter.remove();
            }
        }
	}

	/**
	* 类型转换
	*/
    static TreeMap<Integer, String> type_to_tree = new TreeMap<Integer, String>();

}