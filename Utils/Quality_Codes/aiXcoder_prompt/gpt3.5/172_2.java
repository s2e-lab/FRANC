import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID172{
	/**
	* 十进制整型数值减法，字符串表示每一个数
	*/
	public static String bigDecimalSubtract(String str, String str1){
			//  将两个字符串转换为 BigDecimal 类型
		BigDecimal num1 = new BigDecimal(str);
		BigDecimal num2 = new BigDecimal(str1);

//  执行减法操作
		BigDecimal sub = num1.subtract(num2);

//  返回结果字符串
		return sub.toString();
	}
}