import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class RoundedAvg {
    /**
     * You are given two positive integers n and m, and your task is to compute the
     * average of the integers from n through m (including n and m). 
     * Round the answer to the nearest integer and convert that to binary.
     * If n is greater than m, return -1.
     * Example:
     * rounded_avg(1, 5) => "0b11"
     * rounded_avg(7, 5) => -1
     * rounded_avg(10, 20) => "0b1111"
     * rounded_avg(20, 33) => "0b11010"
     *
     * > roundedAvg(1, 5)
     * "0b11"
     * > roundedAvg(7, 13)
     * "0b1010"
     * > roundedAvg(964, 977)
     * "0b1111001010"
     * > roundedAvg(996, 997)
     * "0b1111100100"
     * > roundedAvg(560, 851)
     * "0b1011000010"
     * > roundedAvg(185, 546)
     * "0b101101110"
     * > roundedAvg(362, 496)
     * "0b110101101"
     * > roundedAvg(350, 902)
     * "0b1001110010"
     * > roundedAvg(197, 233)
     * "0b11010111"
     * > roundedAvg(7, 5)
     * -1
     * > roundedAvg(5, 1)
     * -1
     * > roundedAvg(5, 5)
     * "0b101"
     */
    public static Object roundedAvg(int n, int m) {
        if ((n < m) || (n > m) || (m == -1)) {
           return m;
        }
        
        if (n > m) {
            n = m;
        }
        
        int num1 = n;
        int num2 = m;
        int num3 = num1 < num2? num1 : num2;
        int num4 = num2 < num3? num2 : num3;
        int sum = num1 + num2 + num3; 
        int bit = 1;
}
}