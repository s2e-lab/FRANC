import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID172{
	/**
	* 十进制整型数值减法，字符串表示每一个数
	*/
	public static String bigDecimalSubtract(String str, String str1){
			// Convert input strings to BigDecimal objects
		BigDecimal num1 = new BigDecimal(str);
		BigDecimal num2 = new BigDecimal(str1);
		
		// Subtract num2 from num1 and store the result in a new BigDecimal object
		BigDecimal result = num1.subtract(num2);
		
		// Convert the BigDecimal result to a string and return it
		return result.toString();
	}
	
	public static void main(String args[]) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input[];
		
		// Read input from user
		input = br.readLine().split(" ");
		
		// Call the bigDecimalSubtract() method to perform subtraction
		String output = bigDecimalSubtract(input[0], input[1]);
		
		// Output the result to the console
		System.out.println(output);
	}
}