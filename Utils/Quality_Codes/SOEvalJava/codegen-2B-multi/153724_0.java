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
        int scale = n;
        BigInteger numScaled = BigInteger.valueOf(num).multiply(BigDecimal.TEN.pow(scale));
        return numScaled.divide(BigDecimal.TEN.pow(scale)).doubleValue();
     }
    
    public static void main(String args[]){
        System.out.println(round(1.234567, 3));
       
    }
    
}
