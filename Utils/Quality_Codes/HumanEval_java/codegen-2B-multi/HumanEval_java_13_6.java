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
        if (a == 0 || b == 0)
            return 0;
        int gcd = a;
        while (gcd % b!= 0) {
            gcd = gcd % (b + 1);
        }
        return gcd;
    }

    public static void main(String[] args) throws Exception {
        HashSet<Integer> s = new HashSet<Integer>(Arrays.asList(15));
        s.retainAll(Arrays.asList(19, 7, 15));
}
}