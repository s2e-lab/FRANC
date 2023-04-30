import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class IsSimplePower {
    /**
     * Your task is to write a function that returns true if a number x is a simple
     * power of n and false in other cases.
     * x is a simple power of n if n**int=x
     * For example:
     * is_simple_power(1, 4) => true
     * is_simple_power(2, 2) => true
     * is_simple_power(8, 2) => true
     * is_simple_power(3, 2) => false
     * is_simple_power(3, 1) => false
     * is_simple_power(5, 3) => false
     *
     * > isSimplePower(16, 2)
     * true
     * > isSimplePower(143214, 16)
     * false
     * > isSimplePower(4, 2)
     * true
     * > isSimplePower(9, 3)
     * true
     * > isSimplePower(16, 4)
     * true
     * > isSimplePower(24, 2)
     * false
     * > isSimplePower(128, 4)
     * false
     * > isSimplePower(12, 6)
     * false
     * > isSimplePower(1, 1)
     * true
     * > isSimplePower(1, 12)
     * true
     */
    public static Boolean isSimplePower(int x, int n) {
        if ((n&x)!=x) throw new IllegalArgumentException();
        if ((n&n)<x)
            if ((n&x)>=(x)) return true;
        return false;
    }

    public static boolean is_simple_power(int x, int n) {
        return (isSimplePower(x, n)? true : false);
    }
}

