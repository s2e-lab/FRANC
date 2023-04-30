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
        if (a % b!= 0) { return -1; }
        if (b % a!= 0) { return -1; }
        while (a % a == 0 || (a < 0 && b < 0) || (b < 0 && a < 0))
        {
            a = a % a == 0? 0 : a;
            b = b % b == 0? 0 : b;
        }
        return Math.max(1, Math.min(a, b));
    }
    public static void main(String[] args) throws Exception {
}
}