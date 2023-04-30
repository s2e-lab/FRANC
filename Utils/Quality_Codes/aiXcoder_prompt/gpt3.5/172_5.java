import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID172{
	/**
	* 十进制整型数值减法，字符串表示每一个数
	*/
	public static String bigDecimalSubtract(String str, String str1){
			// Step 1: Convert the strings to BigDecimal objects
		BigDecimal num1 = new BigDecimal(str);
		BigDecimal num2 = new BigDecimal(str1);

		// Step 2: Perform the subtraction operation using the BigDecimal.subtract method
		BigDecimal result = num1.subtract(num2);

		// Step 3: Convert the result back to a string using the BigDecimal.toString method
		String output = result.toString();

		// Step 4: Return the result
		return output;
	}
}