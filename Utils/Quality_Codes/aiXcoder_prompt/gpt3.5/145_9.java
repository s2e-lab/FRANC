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
		}
		if (array == null || other == null) {
			return false;
		}
		if (array.length != other.length) {
			return false;
		}
		for (int i = 0; i < array.length; i++) {
			if (!Objects.equals(array[i], other[i])) {
				return false;
			}
		}
		return true;
	}

	/**
	* 计算阶乘的值
	*/
	public static BigInteger factorial(int n){
		BigInteger result = BigInteger.ONE;
		for (int i = 1; i <= n; i++) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}

	/**
	* 计算组合数的值
	*/
	public static BigInteger binomial(int n, int k){
		BigInteger result = BigInteger.ONE;
		for (int i = 1; i <= k; i++) {
			result = result.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));
		}
		return result;
	}

	/**
	* 计算卡特兰数的值
	*/
	public static BigInteger catalan(int n) {
		return binomial(2 * n, n).divide(BigInteger.valueOf(n + 1));
	}

	/**
	* 计算旋转因子的值
	*/
	public static Complex[] rootsOfUnity(int n){
		Complex[] roots = new Complex[n];
		for (int i = 0; i < n; i++) {
			double real = Math.cos(2 * Math.PI * i / n);
			double imag = Math.sin(2 * Math.PI * i / n);
			roots[i] = new Complex(real, imag);
		}
		return roots;
	}

	/**
	* FFT（快速傅里叶变换）算法的代码实现
	*/
	public static Complex[] fft(Complex[] a){
		int n = a.length;
		if (n == 1) {
			return new Complex[]{a[0]};
		}
		if (n % 2 != 0) {
			throw new IllegalArgumentException("数组长度必须为 2 的整数次幂");
		}
		Complex[] even = new Complex[n / 2];
}
}