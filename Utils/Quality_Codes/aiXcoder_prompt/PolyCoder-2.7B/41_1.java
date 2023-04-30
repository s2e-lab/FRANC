import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID41{
	/**
	* 将map中所有的key转为大写
	*/
	public static Map<String, Object> getAllUpperCase(Map<String, Object> map){
		 System.out.println(map.size());
		 if(map.size()<2){
			 System.out.println();
			 return map;
		 }
		 int i=0;
		 for(Iterator<String> it=map.keySet().iterator();it.hasNext();i++){
			 String key=it.next();
			 System.out.println(key+" -> "+(i%5==0?"":"a")+" : "+map.get(key));
		 }
		 return map;
	}
	
	/*测试用例*/
}