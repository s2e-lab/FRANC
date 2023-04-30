import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID44{
	/**
	* 移除 map 中的 null 或者 空字符串
	*/
	public static void removeNullValue(Map<String, Object> map){
		List keylist = new ArrayList<String>(map.keySet());
		for (Iterator<?> iterator = keylist.iterator(); iterator.hasNext();) {
			Object next = iterator.next();
			if (next == null || ((String) next) == "") iterator.remove();
		}
	}
	
	public static void main(String[] args){
		Map<String, Object> map = new HashMap<String, Object>();
		
		// 将 null 生成键值对，
}
}