import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID44{
	/**
	* 移除 map 中的 null 或者 空字符串
	*/
	public static void removeNullValue(Map<String, Object> map){
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()){
			Entry<String,Object> entry = (Entry<String, Object>)it.next();  
			if(entry.getValue()!= null && entry.getValue().equals(""))
				it.remove();
			
		}
	}
	
	public static Map sortMap(Map<String, String> data){
		Map finalMap = new TreeMap<String, String>();
}
}