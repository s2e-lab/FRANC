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
				if(!upperKey.equals(key)){
					Object value = map.remove(key);
					map.put(upperKey, value);
				}
			}
			return map;
		}
	
	/**
	* 判断一个数是否是素数
	*/
	public static boolean isPrime(int n){
		if(n <= 1) return false;
		if(n == 2 || n == 3) return true;
		if(n % 2 == 0) return false;
		for(int i = 3; i <= Math.sqrt(n); i += 2){
			if(n % i == 0) return false;
		}
		return true;
	}
	
	/**
	* 判断一个数是否是pandigital的，即由1到n（n不一定为9）组成的数字
	* 可以有多个0（对于长度不足9的情况）
	*/
	public static boolean isPandigital(long n){
		boolean[] digits = new boolean[10];
		while(n > 0){
			int digit = (int)(n % 10);
			if(digit == 0) digit = 9;
			if(digits[digit]) return false;
			digits[digit] = true;
			n /= 10;
		}
		for(int i = 1; i <= 9; i++){
			if(!digits[i]) return false;
		}
		return true;
	}
	
	/**
	* 求n位数的全排列
	*/
	public static List<String> permutations(int n){
		int[] nums = new int[n];
		for(int i = 0; i < n; i++){
			nums[i] = i + 1;
		}
		List<String> res = new ArrayList<>();
		do{
			StringBuilder sb = new StringBuilder();
			for(int num : nums){
				sb.append(num);
			}
			res.add(sb.toString());
		}while(nextPermutation(nums));
		return res;
	}
	
	/**
	* 找到一个排列的下一个排列
	*/
	public static boolean nextPermutation(int[] nums){
		int i = nums.length - 2, j = nums.length - 1;
		while(i >= 0 && nums[i] >= nums[i+1]) i--;
}
}