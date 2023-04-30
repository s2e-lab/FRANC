import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class LargestDivisor {
    /**
     * For a given number n, find the largest number that divides n evenly, smaller than n
     * >>> largest_divisor(15)
     * 5
     *
     * > largestDivisor(3)
     * 1
     * > largestDivisor(7)
     * 1
     * > largestDivisor(10)
     * 5
     * > largestDivisor(100)
     * 50
     * > largestDivisor(49)
     * 7
     */
    public static int largestDivisor(int n) {
        if (n > 500000) {
            long[] divisors = new long[(int) n/500000 + 1];
            for (int i = 0 ; i < divisors.length ; i++) {
                divisors[i] = i;
            }
            for (int i = 0 ; i < divisors.length ; i++) {
                for (int j = 2 ; j <= n/divisors[i] ; j++) {
                    if (n % j == 0 && divisors[i]!= j) {
