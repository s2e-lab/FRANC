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
        if (a == 0 || b == 0) return 0;

        if (a > b) {
            int t = a;
            a = b;
            b = t;
        }

        // base case
        if (a == 0) return b;

        int t = b / a;
        b %= a;
        return greatestCommonDivisor(a, b);
    }
}
