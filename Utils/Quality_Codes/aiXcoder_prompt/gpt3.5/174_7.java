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
				Integer.parseInt(numberString);
				return true;
			}catch(NumberFormatException e){
				return false;
			}
		}
		
	/**
	* 判断一个字符串是不是合法的浮点数
	*/
	public static boolean isDecimal(String numberString){
		try{
			Double.parseDouble(numberString);
			return true;
		}catch(NumberFormatException e){
			return false;
		}
	}
	
	/**
	* 将字符串转换成整数，转换失败返回0
	*/
	public static int toInt(String numberString){
		try{
			return Integer.parseInt(numberString);
		}catch(NumberFormatException e){
			return 0;
		}
	}
	
	/**
	* 将字符串转换成浮点数，转换失败返回0.0
	*/
	public static double toDouble(String numberString){
		try{
			return Double.parseDouble(numberString);
		}catch(NumberFormatException e){
			return 0.0;
		}
	}
	
	public static void main(String[] args) throws Exception{
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		if(isInteger(input)){
			System.out.println("This is an integer.");
			System.out.println("This integer is "+toInt(input)+".");
		}else if(isDecimal(input)){
			System.out.println("This is a decimal.");
			System.out.println("This decimal is "+String.format("%.2f",toDouble(input))+".");
		}else{
			System.out.println("This is not a number.");
		}
	}
}