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
	* 判定一个字符串是不是小数
	*/
	public static boolean isFloat(String numberString){
	try{
		Float.parseFloat(numberString);
		return true;
	}catch(NumberFormatException e){
		return false;
	}
	}

	/**
	* 判定一个字符串是不是数字
	*/
	public static boolean isNumber(String numberString){
		if(isInteger(numberString)){
			return true;
		}else if(isFloat(numberString)){
			return true;
		}else{
			return false;
		}
	}

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("请输入一个字符串：");
		String input = br.readLine();

		if(isInteger(input)){
			System.out.println(input + "是整数");
		}else if(isFloat(input)){
			System.out.println(input + "是小数");
		}else if(isNumber(input)){
			System.out.println(input + "是数字");
		}else{
			System.out.println(input + "不是数字");
		}
		
	}
}