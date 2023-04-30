import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID88{
	/**
	* 将16进制字符串转10进制
	*/
	public static int hexStringToInt(String hexString){
			int result = 0;
		for(int i=0; i<hexString.length(); i++){
			int digitValue = Character.digit(hexString.charAt(i), 16);
			result = result * 16 + digitValue;
		}
		return result;
	}
	
	/**
	* 将10进制数转换为16进制表示的字符串
	*/
	public static String intToHexString(int value){
		return Integer.toHexString(value).toUpperCase();
	}
	
	/**
	* 判断两个数是否互素
	*/
	public static boolean isCoprime(int a, int b){
		return BigInteger.valueOf(a).gcd(BigInteger.valueOf(b)).intValue() == 1;
	}
	
	/**
	* 生成两个不同的随机质数
	*/
	public static int[] generatePrimePair(int bits, Random random){
		int[] primes = new int[2];
		primes[0] = BigInteger.probablePrime(bits, random).intValue(); // 生成第一个质数
		do{
			primes[1] = BigInteger.probablePrime(bits, random).intValue(); // 生成第二个质数
		}while(primes[0] == primes[1]); // 确保两个质数不相等
		return primes;
	}
	
	/**
	* 对原始信息进行加密
	*/
	public static String encrypt(String message, int e, int n){
		StringBuilder result = new StringBuilder();
		for(int i=0; i<message.length(); i++){
			int charCode = message.charAt(i);
			int encryptedCharCode = BigInteger.valueOf(charCode).modPow(BigInteger.valueOf(e), BigInteger.valueOf(n)).intValue();
			result.append(intToHexString(encryptedCharCode)).append(" ");
		}
		return result.toString();
	}
	
	/**
	* 对加密过的信息进行解密
	*/
	public static String decrypt(String encryptedMessage, int d, int n){
		StringBuilder result = new StringBuilder();
		String[] encryptedChars = encryptedMessage.split(" ");
		for(String encryptedChar : encryptedChars){
			int encryptedCharCode = hexStringToInt(encryptedChar);
			int decryptedCharCode = BigInteger.valueOf(encryptedCharCode).modPow(BigInteger.valueOf(d), BigInteger.valueOf(n)).intValue();
			result.append((char)decryptedCharCode);
		}
		return result.toString();
	}
	
	/**
	* 获取用户输入
	*/
}