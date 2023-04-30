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
				Object value = map.get(key);
				map.remove(key);
				map.put(key.toUpperCase(), value);
			}
			return map;
	}

	/**
	* 判断一个数是否为素数
	*/
	public static boolean isPrime(int n){
			if(n == 2 || n == 3){
				return true;
			}
			if(n == 1 || n%2 == 0){
				return false;
			}
			for(int i=3;i<=Math.sqrt(n);i+=2){
				if(n%i == 0){
					return false;
				}
			}
			return true;
	}

	/**
	* 将数字转为排列
	*/
	public static List<Integer> toList(int num){
			List<Integer> list = new ArrayList<Integer>();
			while(num > 0){
				list.add(num%10);
				num /= 10;
			}
			return list;
	}

	/**
	* 判断一个数字是否为pandigital，即包含1到n的数字，其中n为数字的位数
	*/
	public static boolean isPandigital(int num){
			List<Integer> digits = toList(num);
			Collections.sort(digits);
			return digits.size() == digits.get(digits.size()-1) && !digits.contains(0);
	}

	/**
	* 返回n位数字中最大的pandigital素数
	*/
	public static int maxPandigitalPrime(int n){
			List<Integer> digits = new ArrayList<Integer>();
			for(int i=1;i<=n;i++){
				digits.add(i);
			}
			Collections.reverse(digits);
			int maxNum = 0;
			for(int i=1;i<=n;i++){
				// 生成所有可能的数字排列
				List<Integer> permutation = new ArrayList<Integer>();
				nextPermutation(digits, permutation);
				for(int k=0;k<permutation.size();k++){
					int num = permutation.get(k);
					if(isPrime(num)){
						maxNum = Math.max(maxNum, num);
					}
				}
				Collections.rotate(digits, 1);
			}
			return maxNum;
	}

	/**
	* 生成全排列
	*/
	public static void nextPermutation(List<Integer> digits, List<Integer> permutation){
			if(permutation.size() == digits.size()){
				return;
			}
}
}