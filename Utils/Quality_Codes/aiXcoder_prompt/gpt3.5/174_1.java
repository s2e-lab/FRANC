import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID174{
	/**
	* 判定一个字符串是不是整数
	*/
	public static boolean isInteger(String numberString){
			try {
			Integer.parseInt(numberString);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

	/**
	* 主函数
	*/
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();

		if(isInteger(s)){
			System.out.println("This is an integer.");
		} else {
			System.out.println("This is not an integer.");
		}
	}
}