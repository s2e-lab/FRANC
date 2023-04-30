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
		return aVal.divide(bVal, 2, RoundingMode.HALF_UP);
	}
	
	
	/**
	* 主函数
	*/
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.print("请输入第一个数：");
		BigDecimal a = input.nextBigDecimal();
		
		System.out.print("请输入第二个数：");
		BigDecimal b = input.nextBigDecimal();
		
		System.out.printf("a + b = %s\n", add(a, b));
		System.out.printf("a - b = %s\n", subtract(a, b));
		System.out.printf("a * b = %s\n", multiply(a, b));
		System.out.printf("a / b = %s\n", divide(a, b));
	}
}