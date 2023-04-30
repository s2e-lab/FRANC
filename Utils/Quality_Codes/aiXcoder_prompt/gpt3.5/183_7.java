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
	public static BigDecimal divide(BigDecimal aVal, BigDecimal bVal){
		return aVal.divide(bVal);
	}

	/**
	* 主函数
	*/
	public static void main (String[] args) {
		BigDecimal aVal = new BigDecimal("10");
		BigDecimal bVal = new BigDecimal("5");
		BigDecimal res;

		// 加法运算
		res = add(aVal, bVal);
		System.out.println("加法运算结果为： " + res);

		// 减法运算
		res = subtract(aVal, bVal);
		System.out.println("减法运算结果为： " + res);

		// 乘法运算
		res = multiply(aVal, bVal);
		System.out.println("乘法运算结果为： " + res);

		// 除法运算
		res = divide(aVal, bVal);
		System.out.println("除法运算结果为： " + res);
	}
}