import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID174{
	/**
	* 判定一个字符串是不是整数
	*/
	public static boolean isInteger(String numberString){
			try{
		int number = Integer.parseInt(numberString);
		return true;
	}catch(NumberFormatException ex){
		return false;
	}
}

/**
* 判定一个字符串是不是浮点数
*/
public static boolean isDouble(String numberString){
	try{
		double number = Double.parseDouble(numberString);
		return true;
	}catch(NumberFormatException ex){
		return false;
	}
}

/**
* 计算平方并返回平方值
*/
public static int square(int number){
	return number * number;
}

/**
* 计算c的平方根
*/
public static double sqrt(double c){
	double epsilon = 1e-15;
	double t = c;
	while (Math.abs(t - c/t) > epsilon*t){
		t = (c/t + t) / 2.0;
	}
	return t;
}

/**
* 计算三角形的周长
*/
public static double trianglePerimeter(double a, double b, double c){
	return a + b + c;
}

/**
* 计算三角形的面积
*/
public static double triangleArea(double a, double b, double c){
	double p = (a + b + c) / 2;
	return sqrt(p * (p - a) * (p - b) * (p - c));
}

/**
* 计算圆的面积
*/
public static double circleArea(double r){
	return Math.PI * r * r;
}

/**
* 计算斐波那契数列的第n项
* 迭代法
*/
public static int fibonacci(int n){
	if(n <= 1){
		return n;
	}
	int fib = 1;
	int prevFib = 1;
	for(int i=2; i<n; i++){
		int temp = fib;
		fib += prevFib;
		prevFib = temp;
	}
	return fib;
}

/**
* 计算斐波那契数列的第n项
* 递归法
*/
public static int fibonacciRecursion(int n){
	if(n <= 1){
		return n;
	}
	return fibonacciRecursion(n-1) + fibonacciRecursion(n-2);
}

/**
* 字符串压缩
* 将重复出现的字符计数压缩成数字+字符的形式
*/
}