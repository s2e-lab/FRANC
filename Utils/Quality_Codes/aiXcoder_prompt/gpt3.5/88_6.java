import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID88{
	/**
	* 将16进制字符串转10进制
	*/
	public static int hexStringToInt(String hexString){
			//先将字符串转为大写字母
		hexString = hexString.toUpperCase();
		//定义一个变量记录转化后的数值
		int result = 0;
		//定义一个变量记录位数
		int index = 0;
		//遍历字符串，从最高位开始相加
		for(int i = hexString.length() - 1; i >= 0; i--){
			//获取当前字符
			char ch = hexString.charAt(i);
			//根据字符判断其所代表的数值
			//如果是数字，则直接将其转为整型
			if(ch >= '0' && ch <= '9'){
				result += (ch - '0') * Math.pow(16, index);
			}
			//如果是字符，则根据其ASCII码值计算其所代表的数值
			else if(ch >= 'A' && ch <= 'F'){
				result += (ch - 'A' + 10) * Math.pow(16, index);
			}
			//如果不是16进制数的有效字符，则直接忽略
			else{
				continue;
			}
			//更新位数
			index++;
		}
		//返回转化后的数值
		return result;
	}

	public static void main(String[] args){
		//测试数据
		String hexString = "1A";
		//调用方法将16进制字符串转为10进制整数
		int result = hexStringToInt(hexString);
		//输出结果
		System.out.println(hexString + "转化为10进制整数为：" + result);
	}
}