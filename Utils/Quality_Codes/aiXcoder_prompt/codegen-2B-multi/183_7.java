import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID183{
	/**
	* BigDecimal加法运算
	*/
	public static BigDecimal add(BigDecimal aVal, BigDecimal bVal){
		if ( bVal.scale == aVal.scale ){	//默认精度不变
			BigDecimal res = aVal.add(bVal);
			return res;
		}
		BigDecimal res = add(aVal,bVal,new BigDecimal("0.0000001"),new BigDecimal((long)Math.log10(bVal.scale)+5),new BigDecimal(Integer.MAX_VALUE));
		return res;
	}
}

