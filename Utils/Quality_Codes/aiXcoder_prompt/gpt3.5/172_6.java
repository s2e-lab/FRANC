import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID172{
	/**
	* 十进制整型数值减法，字符串表示每一个数
	*/
	public static String bigDecimalSubtract(String str, String str1){
			//将字符串转换成BigDecimal类型
		BigDecimal num = new BigDecimal(str);
		BigDecimal num1 = new BigDecimal(str1);
		
		//求出相减后的BigDecimal类型结果
		BigDecimal result = num.subtract(num1);
		
		//将结果转换为字符串类型返回
		return result.toString();
	}
}