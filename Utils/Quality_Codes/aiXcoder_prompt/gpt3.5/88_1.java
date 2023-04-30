import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID88{
	/**
	* 将16进制字符串转10进制
	*/
	public static int hexStringToInt(String hexString){
			int intValue = Integer.parseInt(hexString, 16);
	return intValue;
}

/**
* 计算从1到n的所有自然数的和
*/
public static int sumFirstN(int n){
	int sum = 0;
	for(int i=1; i<=n; i++){
		sum += i;
	}
	return sum;
}

/**
* 判断一个数是否为素数
*/
public static boolean isPrime(int num){
	if(num<2){
		return false;
	}
	for(int i=2; i<num; i++){
		if(num%i == 0){
			return false;
		}
	}
	return true;
}

/**
* 计算两个数的最大公约数
*/
public static int gcd(int a, int b){
	if(b == 0){
		return a;
	}
	return gcd(b, a%b);
}

/**
* 计算两个数的最小公倍数
*/
public static int lcm(int a, int b){
	return (a*b)/gcd(a, b);
}

/**
* 生成n位的随机数
*/
public static String generateRandomNumber(int n){
	Random random = new Random();
	String randomNumber = "";
	for(int i=0; i<n; i++){
		Integer num = random.nextInt(10);
		randomNumber += num.toString();
	}
	return randomNumber;
}

public static void main(String[] args){
	System.out.println(hexStringToInt("10"));
	System.out.println(sumFirstN(5));
	System.out.println(isPrime(7));
	System.out.println(gcd(12, 18));
	System.out.println(lcm(12, 18));
	System.out.println(generateRandomNumber(4));
}
}