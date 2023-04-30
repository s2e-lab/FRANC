import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID119{
	/**
	* 保留两位小数
	*/
	public static String formatDouble(double val){
			return String.format("%.2f", val);
}

/**
* 计算两点之间的距离
*/
public static double distance(double x1, double y1, double x2, double y2){
	double dx = x1 - x2;
	double dy = y1 - y2;
	return Math.sqrt(dx * dx + dy * dy);
}

/**
* 计算三角形面积
*/
public static double area(double a, double b, double c){
	double p = (a + b + c) / 2.0; //半周长
	return Math.sqrt(p * (p - a) * (p - b) * (p - c)); //海伦公式
}

/**
* 判断是否为三角形
*/
public static boolean isTriangle(double a, double b, double c){
	return a + b > c && a + c > b && b + c > a;
}

/**
* 主函数
*/
public static void main(String[] args) throws Exception{
	Scanner sc = new Scanner(System.in);
}
}