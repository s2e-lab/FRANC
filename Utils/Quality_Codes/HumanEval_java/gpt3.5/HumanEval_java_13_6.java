import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class GreatestCommonDivisor {
    /**
     * Return a greatest common divisor of two integers a and b
     * >>> greatest_common_divisor(3, 5)
     * 1
     * >>> greatest_common_divisor(25, 15)
     * 5
     *
     * > greatestCommonDivisor(3, 7)
     * 1
     * > greatestCommonDivisor(10, 15)
     * 5
     * > greatestCommonDivisor(49, 14)
     * 7
     * > greatestCommonDivisor(144, 60)
     * 12
     */
    public static int greatestCommonDivisor(int a, int b) {
	if (b == 0) {
            return a;
        } else {
            return greatestCommonDivisor(b, a % b);
        }
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println(greatestCommonDivisor(3, 5)); // should print 1
        System.out.println(greatestCommonDivisor(25, 15)); // should print 5
        System.out.println(greatestCommonDivisor(3, 7)); // should print 1
        System.out.println(greatestCommonDivisor(10, 15)); // should print 5
        System.out.println(greatestCommonDivisor(49, 14)); // should print 7
        System.out.println(greatestCommonDivisor(144, 60)); // should print 12
    }
}