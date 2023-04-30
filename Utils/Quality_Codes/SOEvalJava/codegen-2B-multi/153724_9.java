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
        double v = num/Math.pow(10, n);
        return Math.ceil(v);
    }
    
    public static void main(String[] args) {
        int n = 3;
        double r = round(1.234567, n);
        System.out.println("r = " + r);
    }
}