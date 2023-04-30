import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID179{
	/**
	* 在map中，如果key存在,则value相加；如果key 不存在，增加新的key，value
	*/
	public static Long incrBy(Map<String,Long> valMap,String key, Long integer){
			if(new File(valMap.get("./")).exists())
		 	{
		  		System.out.println("File:"+new File("./").getAbsolutePath());
		  	}else
				 	{
		  		int num=valMap.entrySet().size();
			        System.out.println("File:"+new File("../../").getAbsolutePath());	
				 	    Iterator<Entry<String,Long>> itr = valMap.entrySet().iterator();
			   		while(itr.hasNext())
			        {
			  