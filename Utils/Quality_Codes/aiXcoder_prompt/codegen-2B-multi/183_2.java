import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ID183{
	/**
	* BigDecimal加法运算
	*/
	public static BigDecimal add(BigDecimal aVal, BigDecimal bVal){
		BigDecimal addVal = new BigDecimal(0);
        addVal = aVal.add(bVal);
        return addVal;
	}
	
	public static void main(String[] args) throws IOException{
		StringTokenizer st = new StringTokenizer(args[7]);
		int p = Integer.parseInt(st.nextToken());
		
}
}