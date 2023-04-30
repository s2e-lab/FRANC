import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID172{
	/**
	* 十进制整型数值减法，字符串表示每一个数
	*/
	public static String bigDecimalSubtract(String str, String str1){
			// Convert the input strings to BigDecimal objects
		BigDecimal num1 = new BigDecimal(str);
		BigDecimal num2 = new BigDecimal(str1);

		// Subtract the second number from the first
		BigDecimal result = num1.subtract(num2);
		
		// Return the result as a string
		return result.toString();
	}

	public static void main(String[] args) {

		// Assuming the input strings are "123" and "45"
		String str = "123";
		String str1 = "45";

		// Call the bigDecimalSubtract method to subtract the two numbers
		String result = bigDecimalSubtract(str, str1);

		// Print the result
		System.out.println(result);
	}
}