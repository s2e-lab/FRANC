import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID183{
	/**
	* BigDecimal加法运算
	*/
	public static BigDecimal add(BigDecimal aVal, BigDecimal bVal){
		BigDecimal result = new BigDecimal(0.0);
		BigDecimal bNeg = new BigDecimal("-1");
		if (aVal.compareTo(bVal) < 0 && aVal.compareTo(bNeg) >= 0){ 
			result = aVal.add(bVal);
		}
		else if (aVal.compareTo(bVal) >= 0 && aVal.compareTo(bNeg) < 0){ 
			result  = aVal.subtract(bVal);
		}
		
}
}