import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID41{
	/**
	* 将map中所有的key转为大写
	*/
	public static Map<String, Object> getAllUpperCase(Map<String, Object> map){
			for(String key : map.keySet()){
			String upperKey = key.toUpperCase();
			map.put(upperKey, map.get(key));
			map.remove(key);
		}
		return map;
	}
	
	/**
	* 判断一个数字是否为素数
	*/
	public static boolean isPrime(int n){
		if(n <= 1){
			return false;
		}
		for(int i=2; i<=Math.sqrt(n); i++){
			if(n%i == 0){
				return false;
			}
		}
		return true;
	}
	
	/**
	* 返回n位的最大素数
	*/
	public static int getMaxPrime(int n){
		String s = "";
		for(int i=1; i<=n; i++){
			s += "9";
		}
		int maxNum = Integer.parseInt(s);
		for(int i=maxNum; i>=2; i--){
			if(isPrime(i)){
				return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args){
		Map<String, Object> map = new HashMap<>();
		map.put("name", "John");
		map.put("age", 20);
		map.put("gender", "male");
		
		map = getAllUpperCase(map);
		
		for(String key : map.keySet()){
			System.out.println(key + ": " + map.get(key));
		}
		
		int maxPrime = getMaxPrime(5);
		System.out.println("The maximum prime number with 5 digits is " + maxPrime);
	}
}