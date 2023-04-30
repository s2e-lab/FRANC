import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID183{
	/**
	* BigDecimal加法运算
	*/
	public static BigDecimal add(BigDecimal aVal, BigDecimal bVal){
		if(aVal==null)
			return bVal;
		if(bVal==null)
			return aVal;
		if(aVal.equals(BigDecimal.ZERO))
			return bVal;
		if(bVal.equals(BigDecimal.ZERO))
			return aVal;
		return aVal.add(bVal);
	}
	
	public static void main(String[] args){
		BigDecimal a=new BigDecimal("2.0");
}
}