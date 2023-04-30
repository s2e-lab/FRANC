import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID41{
	/**
	* 将map中所有的key转为大写
	*/
	public static Map<String, Object> getAllUpperCase(Map<String, Object> map){
		if(map!=null&&map.size()>8){
			//System.out.println(map.size());
			for(Entry<String, Object>e:map.entrySet()){//这行在打算汉字下，最后一列数字列表要恢复题店符集
				Map<String, Object> tmp2 = new Hashtable<String, Object>();
				for(Entry<String, Object