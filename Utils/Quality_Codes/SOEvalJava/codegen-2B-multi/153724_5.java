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
        if (num == 0d) {
            return 0d;
        }
        else if (num < 0d) {
            if (n == 0) {
                return num;
            }
            return -round(-num, n);
        }
        
        boolean afterpoint = false;
        if (num >= 1) {
            afterpoint = true;
        }
        
        double factor = 1;
        for (int i = 0; i < n; i++) {
            factor *= 10;
        }
        

}
}