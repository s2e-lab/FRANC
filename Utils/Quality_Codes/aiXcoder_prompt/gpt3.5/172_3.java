import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID172{
	/**
	* 十进制整型数值减法，字符串表示每一个数
	*/
	public static String bigDecimalSubtract(String str, String str1){
			// Convert the strings to BigDecimal objects
		BigDecimal num1 = new BigDecimal(str);
		BigDecimal num2 = new BigDecimal(str1);

		// Subtract the two numbers
		BigDecimal result = num1.subtract(num2);

		// Return the result as a string
		return result.toString();
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:");
		String firstNumber = sc.nextLine();
		System.out.println("Enter second number:");
		String secondNumber = sc.nextLine();
		String result = bigDecimalSubtract(firstNumber, secondNumber);
		System.out.println("Subtraction Result: "+result);
	}
}