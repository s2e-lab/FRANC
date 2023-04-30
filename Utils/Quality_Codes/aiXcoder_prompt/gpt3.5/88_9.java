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
		for (int i = 0; i < hexString.length(); i++){
			char c = hexString.charAt(i);
			if ('0' <= c && c <= '9'){
				result = result * 16 + c - '0';
			}
			else if ('a' <= c && c <= 'f'){
				result = result * 16 + c - 'a' + 10;
			}
			else if ('A' <= c && c <= 'F'){
				result = result * 16 + c - 'A' + 10;
			}
		}
		return result;
	}

	/**
	* 主函数
	*/
	public static void main(String[] args){
		//读入数据
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();

		//转化为10进制并输出
		System.out.println(hexStringToInt(line));
	}
}