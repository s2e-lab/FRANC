import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID183{
	/**
	* BigDecimal加法运算
	*/
	public static BigDecimal add(BigDecimal aVal, BigDecimal bVal){
		BigDecimal sum = new BigDecimal("0");
		//添加各个阶乘素数到求和表中
		if(aVal.signum()>0){
			sum = sum.add(aVal).add(bVal);
		}
		else{
			sum.add(bVal).add(aVal);	
		}
//		System.out.println("加法算子的变化后的合并
}
}