import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID88{
	/**
	* 将16进制字符串转10进制
	*/
	public static int hexStringToInt(String hexString){
			int decimalValue = Integer.parseInt(hexString, 16); // 使用 Integer.parseInt() 方法将16进制字符串转成10进制
			return decimalValue;
		}
		
	/**
	* 将10进制数值转16进制字符串
	*/
	public static String intToHexString(int decimalValue){
			String hexString = Integer.toHexString(decimalValue); // 使用 Integer.toHexString() 方法将10进制数值转成16进制字符串
			return hexString.toUpperCase(); // 返回大写的16进制字符串
		}
		
	/**
	* 计算两个十六进制数的和
	*/
	public static String addHex(String hexString1, String hexString2){
			int decimalValue1 = hexStringToInt(hexString1); // 将第1个十六进制数转成10进制数值
			int decimalValue2 = hexStringToInt(hexString2); // 将第2个十六进制数转成10进制数值
			int sum = decimalValue1 + decimalValue2; // 计算两个10进制数值的和
			return intToHexString(sum); // 将结果转成16进制字符串返回
		}
		
	public static void main(String[] args){
			String hexString1 = "FFFF";
			String hexString2 = "1";
			System.out.println("Hex String 1: " + hexString1);
			System.out.println("Hex String 2: " + hexString2);
			String sumHex = addHex(hexString1, hexString2);
			System.out.println("Sum of Hex Strings: " + sumHex);
		}
}