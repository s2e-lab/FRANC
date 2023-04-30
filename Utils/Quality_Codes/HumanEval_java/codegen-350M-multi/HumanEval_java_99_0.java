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
        try { // Try to minimize the number of allocations
            if (value.startsWith("-")) value = value.startsWith("+")
                   ? value.substring(1)
                    : value.substring(1);
            if (value == null) throw new NullPointerException("value is null");

            int temp = Integer.parseInt(value);

            if ((temp > Integer.MAX_VALUE) ||
                    (temp < Integer.MIN_VALUE))
                throw new NumberFormatException("value " + value + " is not a valid number,