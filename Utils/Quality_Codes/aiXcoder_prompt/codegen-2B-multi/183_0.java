import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID183{
	/**
	* BigDecimal加法运算
	*/
	public static BigDecimal add(BigDecimal aVal, BigDecimal bVal){
		BigDecimal sum, curTemp, tmp;
		if (aVal.compareTo(BigDecimal.ZERO) == 0 || bVal.compareTo(BigDecimal.ZERO) == 0)
		{
			sum = BigDecimal.ZERO;
		}else{
			sum = aVal.add(bVal);//假设aVal大于bVal
		}
		curTemp = sum;
}
}