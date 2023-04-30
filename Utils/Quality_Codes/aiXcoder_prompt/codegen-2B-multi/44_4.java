import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID44{
	/**
	* 移除 map 中的 null 或者 空字符串
	*/
	public static void removeNullValue(Map<String, Object> map){
		for(Map.Entry<String, Object> entry: map.entrySet()){
			if(entry.getKey() == null || entry.getKey().equals("")){
				entry.setValue(null);
			}
			if(entry.getValue() == null)
				entry.setValue("");
		}
	}

	public static Map<String, Object> ID44(int N){
		if(N < 1)
			return null;
}
}