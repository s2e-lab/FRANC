import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID118{
	/**
	* 返回不小于输入值value的最小整数
	*/
	public static int floor(double val){
			return (int)Math.ceil(val)-1;
}

/**
* 返回大于(或等于)输入值value的最小整数值
*/
public static int ceil(double val){
	return (int)Math.ceil(val);
}

/**
* 返回输入值value的绝对值
*/
public static double abs(double val){
	return Math.abs(val);
}

/**
* 返回输入值value的sin值
*/
public static double sin(double val){
	return Math.sin(val);
}

/**
* 返回输入值value的cos值
*/
public static double cos(double val){
	return Math.cos(val);
}

/**
* 返回输入值value的tan值
*/
public static double tan(double val){
	return Math.tan(val);
}

/**
* 返回输入值value的atan2值
*/
public static double atan2(double x, double y){
	return Math.atan2(x, y);
}

/**
* 返回输入值value的开平方根值
*/
public static double sqrt(double val){
	return Math.sqrt(val);
}

/**
* 返回输入值value的最大公约数
*/
public static int gcd(int x, int y){
	return BigInteger.valueOf(x).gcd(BigInteger.valueOf(y)).intValue();
}

/**
* 返回输入值value的阶乘值
*/
public static BigInteger factorial(int n){
	BigInteger result = BigInteger.valueOf(1);
	for(int i=2;i<=n;i++){
		result = result.multiply(BigInteger.valueOf(i));
	}
	return result;
}

/**
* 返回输入值value的幂次方值
*/
public static double pow(double x, double y){
	return Math.pow(x, y);
}

public static void main (String[] args) throws java.lang.Exception
{
	Scanner sc=new Scanner(System.in);
}
}