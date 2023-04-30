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
        double power = Math.pow(10.0, n);
        double scaledNum = num * power;
        double roundedScale = Math.ceil(scaledNum);
        return scaledNum / roundedScale;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = scanner.nextDouble();

        while(num>0.001){
        System.out.println(num);
        num = round(num, 3);
        }
}
}