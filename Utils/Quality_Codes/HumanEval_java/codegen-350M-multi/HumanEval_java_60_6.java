import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class SumToN {
    /**
     * sum_to_n is a function that sums numbers from 1 to n.
     * >>> sum_to_n(30)
     * 465
     * >>> sum_to_n(100)
     * 5050
     * >>> sum_to_n(5)
     * 15
     * >>> sum_to_n(10)
     * 55
     * >>> sum_to_n(1)
     * 1
     *
     * > sumToN(1)
     * 1
     * > sumToN(6)
     * 21
     * > sumToN(11)
     * 66
     * > sumToN(30)
     * 465
     * > sumToN(100)
     * 5050
     */
    public static int sumToN(int n) {
        if (n <= 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        else if (n % 2 == 1)
            return 1;
        else
            return sumToN(n / 2);
    }

    private static void printAnswer(int n) {
        System.out.println(n);
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
}
}