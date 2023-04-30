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
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BigDecimal x = new BigDecimal(br.readLine());
		BigDecimal y = new BigDecimal(br.readLine());
		
		BigDecimal addResult = add(x, y);
		BigDecimal subtractResult = subtract(x, y);
		BigDecimal multiplyResult = multiply(x, y);
		BigDecimal divideResult = divide(x, y);
		
		System.out.println("BigDecimal加法运算结果为：" + addResult);
		System.out.println("BigDecimal减法运算结果为：" + subtractResult);
		System.out.println("BigDecimal乘法运算结果为：" + multiplyResult);
		System.out.println("BigDecimal除法运算结果为：" + divideResult);
	}
}