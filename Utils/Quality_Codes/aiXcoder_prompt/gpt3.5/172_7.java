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

		// Subtract num2 from num1
		BigDecimal result = num1.subtract(num2);

		// Convert the BigDecimal result to a string and return it
		return result.toString();
	}
}