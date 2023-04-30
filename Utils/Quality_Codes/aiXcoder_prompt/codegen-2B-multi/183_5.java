import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID183{
	/**
	* BigDecimal加法运算
	*/
	public static BigDecimal add(BigDecimal aVal, BigDecimal bVal){
		BigDecimal ret = new BigDecimal("0");
		if((aVal!=null)&&(bVal!=null)){
			ret = aVal.add(bVal);
		}
		return ret;
	}
	
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		BigDecimal a = sc.nextBigDecimal();//输入a
		BigDecimal b = sc.nextBigDecimal();
}
}