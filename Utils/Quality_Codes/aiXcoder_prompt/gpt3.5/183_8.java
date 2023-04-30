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
	public static BigDecimal subtract(BigDecimal aVal, BigDecimal bVal){
		BigDecimal result = aVal.subtract(bVal);
		return result;
	}

	/**
	* BigDecimal乘法运算
	*/
	public static BigDecimal multiply(BigDecimal aVal, BigDecimal bVal){
		BigDecimal result = aVal.multiply(bVal);
		return result;
	}

	/**
	* BigDecimal除法运算
	*/
	public static BigDecimal divide(BigDecimal aVal, BigDecimal bVal){
		BigDecimal result = aVal.divide(bVal);
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); //创建Scanner类对象
		BigDecimal a,b,result;
		//获取用户输入的数字
		System.out.println("请输入第一个数字：");
		a = sc.nextBigDecimal();
		System.out.println("请输入第二个数字：");
		b = sc.nextBigDecimal();
		result = add(a,b); //计算加法
		System.out.println("两数之和为："+result);
		
		result = subtract(a,b); //计算减法
		System.out.println("两数之差为："+result);
		
		result = multiply(a,b); //计算乘法
		System.out.println("两数之积为："+result);
		
		result = divide(a,b); //计算除法
		System.out.println("两数之商为："+result);
		
		sc.close(); //关闭Scanner类对象
	}

}