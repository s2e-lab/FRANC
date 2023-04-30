import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID172{
	/**
	* 十进制整型数值减法，字符串表示每一个数
	*/
	public static String bigDecimalSubtract(String str, String str1){
			// Converting the strings to BigDecimal objects
		BigDecimal num1 = new BigDecimal(str);
		BigDecimal num2 = new BigDecimal(str1);

		// Performing the subtraction operation
		BigDecimal result = num1.subtract(num2);

		// Converting the result back to a string and returning it
		return result.toString();
	}
}