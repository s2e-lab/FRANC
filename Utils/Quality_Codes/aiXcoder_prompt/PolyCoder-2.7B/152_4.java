import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID152{
	/**
	* 生成32位的MD5码
	*/
	public static String toMd5Code(String str){
			if(str == null){
				return "";
			}
        StringBuffer md5_code = new StringBuffer();
        Map<Integer, String> map = splitStringByCount(str);
        Iterator<String> iterator = map.keySet().iterator();
        String current = "";
        String new_line = "";
}
}