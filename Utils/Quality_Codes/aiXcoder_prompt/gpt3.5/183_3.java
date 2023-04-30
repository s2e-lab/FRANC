import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID183{
	/**
	* BigDecimal加法运算
	*/
	public static BigDecimal add(BigDecimal aVal, BigDecimal bVal){
			BigDecimal result = aVal.add(bVal);
		return result;
	}

	/**
	* BigDecimal减法运算
	*/
	public static BigDecimal sub(BigDecimal aVal, BigDecimal bVal){
		BigDecimal result = aVal.subtract(bVal);
		return result;
	}

	/**
	* BigDecimal乘法运算
	*/
	public static BigDecimal mul(BigDecimal aVal, BigDecimal bVal){
		BigDecimal result = aVal.multiply(bVal);
		return result;
	}

	/**
	* BigDecimal除法运算
	*/
	public static BigDecimal div(BigDecimal aVal, BigDecimal bVal, int scale){
		BigDecimal result = aVal.divide(bVal, scale, BigDecimal.ROUND_HALF_UP);
		return result;
	}

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			BigDecimal a = sc.nextBigDecimal();
			BigDecimal b = sc.nextBigDecimal();

			//计算并输出结果
			System.out.println(add(a, b));
			System.out.println(sub(a, b));
			System.out.println(mul(a, b));
			System.out.println(div(a, b, 10));
		}
	} 
}