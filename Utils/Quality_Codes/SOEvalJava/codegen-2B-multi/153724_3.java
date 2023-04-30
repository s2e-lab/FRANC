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
        String str = Double.toString(num);
        if(str.endsWith(".00")){
            str = str.substring(0, str.length()-3);
        }
        
        int index = 0;
        for(char c : str.toCharArray()){
            if(c == '.' || c == ','){
                continue;
            }
            break;
        }
        
        
        int round = (int)Math.pow(10D, n);
        index = index + n;

}
}