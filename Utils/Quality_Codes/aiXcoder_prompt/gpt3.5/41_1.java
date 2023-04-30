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
				map.put(key.toUpperCase(), map.remove(key));
			}
			return map;
	}

	/**
	* 判断一个数是否是素数
	*/
	public static boolean isPrime(int n){
		if(n <=1 ){ //小于等于1都不是素数
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++){ //遍历2到根号n
			if(n%i == 0){ //如果存在能被整除的数
				return false; //不是素数
			}
		}
		return true; //是素数
	}

	/**
	* 判断一个数的每个数字都不重复
	*/
	public static boolean isPandigital(int n){
		String nStr = Integer.toString(n);
		for(int i=1;i<=nStr.length();i++){ //从1到n的位数遍历
			if(!nStr.contains(Integer.toString(i))){ //如果不包含当前数位
				return false; //则不是全数字
			}
		}
		return true; //是全数字
	}

	/**
	* 找到n位数中最大的素数全数字
	*/
	public static int findLargestPandigitalPrime(int n){
		int largest = 0;
		for(int i=(int)Math.pow(10,n-1);i<Math.pow(10,n);i++){ //从10的n-1次方到10的n次方遍历
			if(isPandigital(i) && isPrime(i)){ //如果是全数字素数
				largest = i; //更新最大值
			}
		}
		return largest;
	}

	public static void main(String[] args){
		Map<String, Object> testMap = new HashMap<String, Object>();
		testMap.put("name", "John");
		testMap.put("age", 20);
		testMap.put("gender", "male");

		System.out.println("Original Map: "+testMap);
		System.out.println("All Key to upperCase Map: "+getAllUpperCase(testMap)); //{"NAME":"John","AGE":20,"GENDER":"male"}

		int n = 4; //n位数
}
}