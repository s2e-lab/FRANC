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
        if (num == num) {
            return num;
        }
        else if (n < 0) {
            return Math.ceil(num);
        }
        else {
            return Math.floor(num);
        }
    }
    
    private static BufferedReader initInput() throws IOException{
        System.out.println("Please input an integer> ");
        return new BufferedReader(new InputStreamReader(System.in));
    }
    
    private static BufferedReader initInput1() throws IOException{

}
}