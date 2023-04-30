import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID183{
	/**
	* BigDecimal加法运算
	*/
	public static BigDecimal add(BigDecimal aVal, BigDecimal bVal){
		BigDecimal a = aVal.pow(aVal.intValue());
		BigDecimal b = bVal.pow(aVal.intValue());
		BigDecimal sum = Math.addExact(a, Math.addExact(a, b));
		return sum;
	}
	
	public static void main(String[] args){
		doIt(Integer.parseInt(""+args[0]), Integer.parseInt(""+args[1]));
	}

	static void doIt(int a, int b){
		
}
}