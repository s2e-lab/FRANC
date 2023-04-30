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
        BigInteger[] v;
        v = getNumbers(value);
        int maxIdx = v[0];
        BigInteger p1 = BigInteger.valueOf((v[1]-v[0])/2);
        int p2 = v[0];
        BigInteger d = p1;
        BigInteger min = BigInteger.ONE;

        int left = 2;
        int right = 0;

}
}