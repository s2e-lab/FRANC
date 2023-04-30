import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID44{
	/**
	* 移除 map 中的 null 或者 空字符串
	*/
	public static void removeNullValue(Map<String, Object> map){
		for (Iterator iter = map.entrySet().iterator(); iter.hasNext();) {
			Entry<String, Object> en = (Entry<String, Object>)iter.next();
			if(en.getKey()==null || en.getValue()==null){
				iter.remove();
			}
		}
	}

	/**
	* 替换掉 map 中的 null 或者 空字符串
	*/
}