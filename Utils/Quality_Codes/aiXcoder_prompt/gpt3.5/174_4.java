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
	* 判定一个字符串是不是浮点数
	*/
	public static boolean isFloat(String numberString){
		try{
			Double.parseDouble(numberString);
			return true;
		}catch(NumberFormatException e){
			return false;
		}
	}

	/**
	* 主函数，读取输入并输出结果
	*/
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()){
			String line = sc.nextLine().trim();
			if(line.isEmpty()){
				continue;
			}
			if(isInteger(line)){
				System.out.println(line + " is integer");
			}else if(isFloat(line)){
				System.out.println(line + " is float");
			}else{
				System.out.println(line + " is not a number");
			}
		}
	}
}