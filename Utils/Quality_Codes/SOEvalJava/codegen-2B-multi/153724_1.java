import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

class ID_153724{
    /**
     * Write a function to round a number up to n decimal places.
     * 
     * Example:
     * double num = 1.234567;
     * double result = round(num, 3);
     * 
     * output: 1.235
     */
    public static double round(double num, int n) {

    	BigDecimal bd = new BigDecimal(num);
    	bd = bd.stripTrailingZeros();
    	bd = bd.setScale(n, BigDecimal.ROUND_HALF_UP);
    	double rntNum = bd.doubleValue();
    	return rntNum;
    }

}