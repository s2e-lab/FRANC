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
        BigDecimal bigNum = new BigDecimal(num);
        bigNum.setScale(n, RoundingMode.HALF_UP);
        return bigNum.doubleValue();
    }
    
    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("."));
        String str;
}
}