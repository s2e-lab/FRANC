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
		Integer.parseInt(numberString); //尝试将字符串转换为整数
		return true; //转换成功，是整数
	}catch(NumberFormatException e){
		return false; //转换失败，不是整数
	}
}

public static void main(String[] args) throws Exception{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String input = br.readLine();
	if(isInteger(input)){
		System.out.println(input + "是整数");
	}else{
		System.out.println(input + "不是整数");
	}
}
}