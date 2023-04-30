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
	* BigDecimal除法运算
	*/
	public static BigDecimal divide(BigDecimal aVal, BigDecimal bVal, int scale){
		return aVal.divide(bVal, scale, RoundingMode.HALF_UP);
	}

	/**
	* 主函数
	*/
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		//输入a，b两个BigDecimal数
		BigDecimal a = sc.nextBigDecimal();
		BigDecimal b = sc.nextBigDecimal();

		//加法运算
		System.out.println("加法运算结果：");
		System.out.println(add(a, b));

		//减法运算
		System.out.println("减法运算结果：");
		System.out.println(subtract(a, b));

		//乘法运算
		System.out.println("乘法运算结果：");
		System.out.println(multiply(a, b));

		//除法运算
		System.out.println("除法运算结果：");
		System.out.println("请输入精度：");
		int scale = sc.nextInt();
		System.out.println(divide(a, b, scale));

	}
}