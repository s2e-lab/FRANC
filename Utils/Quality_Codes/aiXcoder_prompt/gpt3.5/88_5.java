import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID88{
	/**
	* 将16进制字符串转10进制
	*/
	public static int hexStringToInt(String hexString){
			//remove this line and start writing your code here

		BigInteger bigInt = new BigInteger(hexString, 16);
		return bigInt.intValue();
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		String hexString = sc.nextLine();
		int decimal = hexStringToInt(hexString);
		System.out.println(decimal);
		
	}
}