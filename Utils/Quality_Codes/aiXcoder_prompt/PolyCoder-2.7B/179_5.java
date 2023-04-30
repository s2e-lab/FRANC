import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID179{
	/**
	* 在map中，如果key存在,则value相加；如果key 不存在，增加新的key，value
	*/
	public static Long incrBy(Map<String,Long> valMap,String key, Long integer){
		 if(valMap.containsKey(key)){ // 判断是否存在key，若存在插入新节点
			if(integer==0){ // 如果没有值，那么要更新key的值
			  valMap.put(key,
				     numberAdd(valMap.get(key),integer)); // 更新key为value
				// System.out.println("+valAdd+" "+key+" => "+value);
				// valMap.put(key,value);
			}else{ // 如果大