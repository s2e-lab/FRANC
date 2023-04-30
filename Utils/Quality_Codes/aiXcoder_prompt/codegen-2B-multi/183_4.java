import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID183{
	/**
	* BigDecimal加法运算
	*/
	public static BigDecimal add(BigDecimal aVal, BigDecimal bVal){
		return new BigDecimal(aVal.intValue()+bVal.intValue());

	}

	/**
	* BigDecimal加法运算（大）
	*/
	public static BigDecimal add(BigDecimal aVal, int bVal){
		return new BigDecimal(aVal.intValue()+bVal);

	}

	/**
	* BigDecimal加法运算（小）
	*/
}