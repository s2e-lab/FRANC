import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID118{
	/**
	* 返回不小于输入值value的最小整数
	*/
	public static int floor(double val){
		if(val<0){
			return 0;
		}
		int result = Integer.MAX_VALUE;
		int i =0;
		do{
			result = result * 10;
			result = result / val;
			i++;
		} while (i < val);
		return result;

	}
	
	/**
	* 将一个值转换成标准值
	*/
	public static void print(double val){
		System.out.println(val);
}
}