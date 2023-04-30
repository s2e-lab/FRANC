import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID171{
	/**
	* 去掉浮点数多余的0
	*/
	public static String rvZeroAndDot(String s){
			StringBuilder sb = new StringBuilder(s);
		int index = sb.length() - 1;
		while(index >= 0 && (sb.charAt(index) == '0' || sb.charAt(index) == '.')){
			sb.deleteCharAt(index);
			index--;
		}
		return sb.toString();
	}

	/**
	* 计算两点间的距离
	*/
	public static double calcDistance(double x1, double y1, double x2, double y2){
		double deltaX = x1 - x2;
		double deltaY = y1 - y2;
		return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
	}

	/**
	* 计算三角形的面积
	*/
	public static double calcTriangleArea(double a, double b, double c){
		double p = (a + b + c) / 2;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext()){
			double x1 = sc.nextDouble();
			double y1 = sc.nextDouble();
			double x2 = sc.nextDouble();
			double y2 = sc.nextDouble();
			double x3 = sc.nextDouble();
			double y3 = sc.nextDouble();
			double a = calcDistance(x1, y1, x2, y2);
			double b = calcDistance(x2, y2, x3, y3);
			double c = calcDistance(x3, y3, x1, y1);
			double s = calcTriangleArea(a, b, c);
			System.out.println(rvZeroAndDot(Double.toString(s)));
		}
	}
}