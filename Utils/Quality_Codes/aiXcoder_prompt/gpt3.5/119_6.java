import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID119{
	/**
	* 保留两位小数
	*/
	public static String formatDouble(double val){
			String format = "#.00";
DecimalFormat df = new DecimalFormat(format);
return df.format(val);
	}

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		
		/**
		* 读取输入
		*/
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double x3 = sc.nextDouble();
		double y3 = sc.nextDouble();

		/**
		* 计算三角形边长
		*/
		double a = Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 - y2));
		double b = Math.sqrt((x2 - x3)*(x2 - x3) + (y2 - y3)*(y2 - y3));
		double c = Math.sqrt((x3 - x1)*(x3 - x1) + (y3 - y1)*(y3 - y1));

		/**
		* 计算三角形面积
		*/
		double p = (a + b + c) / 2;
		double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));

		/**
		* 输出结果
		*/
		System.out.println(formatDouble(S));
	}
}