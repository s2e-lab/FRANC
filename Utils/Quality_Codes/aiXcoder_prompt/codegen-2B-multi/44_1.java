import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID44{
	/**
	* 移除 map 中的 null 或者 空字符串
	*/
	public static void removeNullValue(Map<String, Object> map){
		if (map!= null) {
			Iterator<String> iterator = map.keySet().iterator();
			while (iterator.hasNext()) {
				String key = iterator.next();
				System.err.print(key);
				if (map.get(key) == null || map.get(key).toString().equals("")) {
					iterator.remove();
				}
			}
		}
	}

	public static void main(String[] args) {
		Map<String, Integer> map = new LinkedHashMap<>();
		
}
}