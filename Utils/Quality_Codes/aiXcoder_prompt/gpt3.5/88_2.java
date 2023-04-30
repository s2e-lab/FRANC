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
	* 将10进制整数转16进制字符串
	*/
	public static String intToHexString(int intValue){
			String hexString = Integer.toHexString(intValue);
			return hexString;
	}

	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Please input a hexadecimal number: ");
		String hexStr = input.nextLine();
		
		// 将16进制字符串转为10进制整数
		int decimalNum = hexStringToInt(hexStr);
		
		// 输出10进制整数
		System.out.println("Decimal number: " + decimalNum);
		
		// 将10进制整数转为16进制字符串
		String hexString = intToHexString(decimalNum);
		
		// 输出16进制字符串
		System.out.println("Hexadecimal number: 0x" + hexString.toUpperCase());
	}
}