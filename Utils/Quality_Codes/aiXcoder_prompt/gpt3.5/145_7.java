import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID145{
	/**
	* 判断两个数组的内容是否相等 用于equals的比较
	*/
	public static boolean equals(Object[] array, Object[] other){
			if (array == null && other == null) {
				return true;
			} else if (array != null && other != null) {
				if (array.length != other.length) {
					return false;
				} else {
					for (int i = 0; i < array.length; i++) {
						if (!Objects.equals(array[i], other[i])) {
							return false;
						}
					}
					return true;
				}
			} else {
				return false;
			}
		}
		
		/**
		* 给定一个字符串，按指定的分隔符分割成数组
		*/
		public static String[] split(String input, String delimiter){
			if (input == null) {
				return new String[0];
			}

			StringTokenizer st = new StringTokenizer(input, delimiter);
			String[] result = new String[st.countTokens()];
			for (int i = 0; i < result.length; i++) {
				result[i] = st.nextToken();
			}
			return result;
		}
		
		/**
		* 计算阶乘
		*/
		public static BigInteger factorial(int n){
			if (n < 0) {
				throw new IllegalArgumentException("The value of n cannot be negative.");
			}

			BigInteger result = BigInteger.ONE;
			for (int i = 1; i <= n; i++) {
				result = result.multiply(BigInteger.valueOf(i));
			}
			return result;
		}
		
		/**
		* 计算组合数
		*/
		public static BigInteger combination(int n, int r){
			if (n < 0 || r < 0 || r > n) {
				throw new IllegalArgumentException("The values of n and r must be non-negative and r cannot be greater than n.");
			}

			BigInteger numerator = factorial(n);
			BigInteger denominator = factorial(r).multiply(factorial(n - r));
			return numerator.divide(denominator);
		}
		
		/**
		* 递归计算斐波那契数列
		*/
		public static BigInteger fibonacci(int n){
			if (n < 0) {
				throw new IllegalArgumentException("The value of n cannot be negative.");
			}

			if (n == 0 || n == 1) {
				return BigInteger.valueOf(n);
			}
}
}