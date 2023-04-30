import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID183{
	/**
	* BigDecimal加法运算
	*/
	public static BigDecimal add(BigDecimal aVal, BigDecimal bVal){
			return aVal.add(bVal);
}

	/**
	* BigDecimal减法运算
	*/
	public static BigDecimal subtract(BigDecimal aVal, BigDecimal bVal){
		return aVal.subtract(bVal);
	}

	/**
	* BigDecimal乘法运算
	*/
	public static BigDecimal multiply(BigDecimal aVal, BigDecimal bVal){
		return aVal.multiply(bVal);
	}

	/**
	* BigDecimal除法运算，保留两位小数并四舍五入
	*/
	public static BigDecimal divide(BigDecimal aVal, BigDecimal bVal){
		return aVal.divide(bVal, 2, RoundingMode.HALF_UP);
	}

	/**
	* 计算圆形的面积
	*/
	public static BigDecimal calculateCircleArea(BigDecimal radius){
		BigDecimal pi = new BigDecimal("3.14");
		//半径的平方
		BigDecimal rSquare = multiply(radius, radius);
		return multiply(pi, rSquare);
	}

	/**
	* 计算矩形的面积
	*/
	public static BigDecimal calculateRectangleArea(BigDecimal length, BigDecimal width){
		return multiply(length, width);
	}

	/**
	* 计算三角形的面积
	*/
	public static BigDecimal calculateTriangleArea(BigDecimal base, BigDecimal height){
		//底边乘以高
		BigDecimal bottomTimesHeight = multiply(base, height);
		//除以2
		return divide(bottomTimesHeight, new BigDecimal("2"));
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		//选择计算哪种形状的面积
		System.out.println("请选择计算哪种形状的面积：");
		System.out.println("1. 圆形");
		System.out.println("2. 矩形");
		System.out.println("3. 三角形");
		int choice = sc.nextInt();

}
}