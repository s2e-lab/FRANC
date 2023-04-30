import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID44{
	/**
	* 移除 map 中的 null 或者 空字符串
	*/
	public static void removeNullValue(Map<String, Object> map){
		Iterator<Map.Entry<String, Object>> iterator = map.entrySet().iterator();
		while (iterator.hasNext()){
			Map.Entry<String, Object> entry = iterator.next();
			Object value = entry.getValue();
			if(value == null || (value instanceof String && ((String)value).length() == 0)){
				iterator.remove();
			}
		}
	}

}