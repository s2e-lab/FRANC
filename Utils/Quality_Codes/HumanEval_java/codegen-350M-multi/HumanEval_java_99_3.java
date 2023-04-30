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
        try {
            if (value == null) {
                return -1;   // The value was null or was 0.  Not good to return.
            }

            StringTokenizer tokenizer = new StringTokenizer(value, "_");
            int result =  -1;

            while (tokenizer.hasMoreTokens()) {
                Object tok = tokenizer.nextToken();

                if (tok instanceof Long) {    // Numbers can have one of three types, either an integer, a number
                    long value1 = ((Number) tok).longValue