import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID41{
	/**
	* 将map中所有的key转为大写
	*/
	public static Map<String, Object> getAllUpperCase(Map<String, Object> map){
		 
	   map.clear();
	   for(int i=0;i< map.size();i++){
	           map.put((String)map.get(i),"ABC-"+i);     
	   }
	   
	   return map;
	   
	}
	

    public static Map<String, Object> getMapFromName(String name){

        Map<String, Object> map = new HashMap<>();
        // 读
}
}