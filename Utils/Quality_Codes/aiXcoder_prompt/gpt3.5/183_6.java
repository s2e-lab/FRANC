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


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		BigDecimal a,b;
		int scale;

		//读入两个BigDecimal类型的数
		a = sc.nextBigDecimal();
		b = sc.nextBigDecimal();

		//读入保留小数位数
		scale = sc.nextInt();

		//对两个数分别进行加减乘除运算，结果保留scale位小数
		BigDecimal sum = add(a, b).setScale(scale, RoundingMode.HALF_UP);
		BigDecimal difference = subtract(a, b).setScale(scale, RoundingMode.HALF_UP);
		BigDecimal product = multiply(a, b).setScale(scale, RoundingMode.HALF_UP);
		BigDecimal quotient = divide(a, b, scale);

		//输出结果
		System.out.println(sum + " " + difference + " " + product + " " + quotient);
	}
}