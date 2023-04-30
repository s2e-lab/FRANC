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
        double res = num ;
        for(int i=0; i<n ; i++) res = num - (num-Math.floor(num)) && n>=0?Math.round((float) res):Math.ceil((float) res) ;
        return res ;
    }
    
    public static void main(String[] args) throws IOException{
        /** input */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        /** input */
        //String s1;
}
}