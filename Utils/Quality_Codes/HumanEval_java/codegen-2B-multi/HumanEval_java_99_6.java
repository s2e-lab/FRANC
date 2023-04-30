import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ClosestInteger {
    /**
     * * Create a function that takes a value (string) representing a number
     * and returns the closest integer to it. If the number is equidistant
     * from two integers, round it away from zero.

     * Examples
     * >>> closest_integer("10")
     * 10
     * >>> closest_integer("15.3")
     * 15

     * Note:
     * Rounding away from zero means that if the given number is equidistant
     * from two integers, the one you should return is the one that is the
     * farthest from zero. For example closest_integer("14.5") should
     * return 15 and closest_integer("-14.5") should return -15.
     *
     * > closestInteger("10")
     * 10
     * > closestInteger("14.5")
     * 15
     * > closestInteger("-15.5")
     * -16
     * > closestInteger("15.3")
     * 15
     * > closestInteger("0")
     * 0
     */
    public static int closestInteger(String value) {
         int num = Integer.valueOf(value) ;
        if(num==0){
            return num;
        }
        double double_val = Double.valueOf(value) ;
        long lng = (long) Math.round(double_val);
        if (lng == double_val) return lng; 
        double_val = Math.abs(double_val);
        double abs_val = Math.abs(lng - (double)num);
}
}