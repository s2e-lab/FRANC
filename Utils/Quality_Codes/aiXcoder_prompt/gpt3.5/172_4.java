import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID172{
	/**
	* 十进制整型数值减法，字符串表示每一个数
	*/
	public static String bigDecimalSubtract(String str, String str1){
			// Convert the given strings to BigDecimal objects
		BigDecimal num1 = new BigDecimal(str);
		BigDecimal num2 = new BigDecimal(str1);

		// Subtract the two numbers and return the result as a string
		return num1.subtract(num2).toString();
	}

	public static void main(String[] args) throws Exception {
		// Read the input from the standard input
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();

		// Split the input into two separate strings
		String[] arr = line.split(" ");
		String str1 = arr[0];
		String str2 = arr[1];

		// Call the bigDecimalSubtract function to subtract the numbers
		String result = bigDecimalSubtract(str1, str2);

		// Print the result to the standard output
		System.out.println(result);
	}
}