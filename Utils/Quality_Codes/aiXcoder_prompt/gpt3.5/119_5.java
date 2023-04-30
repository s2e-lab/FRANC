import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID119{
	/**
	* 保留两位小数
	*/
	public static String formatDouble(double val){
			String formattedVal = String.format("%.2f", val);
return formattedVal;
}

/**
* 计算矩形面积
*/
public static double rectangleArea(double width, double height){
double area = width * height;
return area;
}

/**
* 计算圆形面积
*/
public static double circleArea(double radius){
double area = Math.PI * Math.pow(radius, 2);
return area;
}

/**
* 计算三角形面积
*/
public static double triangleArea(double base, double height){
double area = 0.5 * base * height;
return area;
}

// 主函数，输入参数并输出结果
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
double width, height, radius, base, triHeight;

// 计算矩形面积
System.out.println("计算矩形面积：");
System.out.print("请输入矩形宽度：");
width = sc.nextDouble();
System.out.print("请输入矩形高度：");
height = sc.nextDouble();
double rectangleArea = rectangleArea(width, height);
System.out.println("矩形面积为：" + formatDouble(rectangleArea));

// 计算圆形面积
System.out.println("计算圆形面积：");
System.out.print("请输入圆形半径：");
radius = sc.nextDouble();
double circleArea = circleArea(radius);
System.out.println("圆形面积为：" + formatDouble(circleArea));

// 计算三角形面积
System.out.println("计算三角形面积：");
System.out.print("请输入三角形底边长度：");
base = sc.nextDouble();
System.out.print("请输入三角形高度：");
triHeight = sc.nextDouble();
double triangleArea = triangleArea(base, triHeight);
System.out.println("三角形面积为：" + formatDouble(triangleArea));
}
}