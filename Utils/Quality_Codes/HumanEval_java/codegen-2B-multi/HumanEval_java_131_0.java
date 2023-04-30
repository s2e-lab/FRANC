import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Digits {
    /**
     * Given a positive integer n, return the product of the odd digits.
     * Return 0 if all digits are even.
     * For example:
     * digits(1)  == 1
     * digits(4)  == 0
     * digits(235) == 15
     *
     * > digits(5)
     * 5
     * > digits(54)
     * 5
     * > digits(120)
     * 1
     * > digits(5014)
     * 5
     * > digits(98765)
     * 315
     * > digits(5576543)
     * 2625
     * > digits(2468)
     * 0
     */
    public static int digits(int n) {
        String noStr = "" + n;
        int sum = 0;
        for (int i = 0; i < noStr.length(); i++) {
            if (noStr.charAt(i)!= '0')
                sum += 1;
        }
        if (sum % 2 == 1)
            return sum;
        return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
}
}