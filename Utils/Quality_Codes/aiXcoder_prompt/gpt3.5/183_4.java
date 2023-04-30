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
	* BigDecimal除法运算(四舍五入到整数)
	*/
	public static BigDecimal divide(BigDecimal aVal, BigDecimal bVal){
		return aVal.divide(bVal, 0, BigDecimal.ROUND_HALF_UP);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入两个大整数：");
		String a = sc.next();
		String b = sc.next();
		BigDecimal aVal = new BigDecimal(a);
		BigDecimal bVal = new BigDecimal(b);

		//进行加法运算
		BigDecimal sum = add(aVal, bVal);
		System.out.println("和：" + sum);

		//进行减法运算
		BigDecimal dif = subtract(aVal, bVal);
		System.out.println("差：" + dif);

		//进行乘法运算
		BigDecimal product = multiply(aVal, bVal);
		System.out.println("积：" + product);

		//进行除法运算
		BigDecimal quotient = divide(aVal, bVal);
		System.out.println("商：" + quotient);
	}
}