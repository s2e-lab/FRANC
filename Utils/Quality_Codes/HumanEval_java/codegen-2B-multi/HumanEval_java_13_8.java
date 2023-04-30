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
	int c;
        if (a == 0 || b == 0) {
            return Math.max(a, b);
        }
        c = Math.abs(a % b);
        if (c == 0) {
            return a / b;
        }
        return a / c;
    }

    public static void main(String[] args) throws java.lang.Exception {
        //Scanner in = new Scanner(System.in);
		int T, a, b, c;
		a = b = c = 0;
		
}
}