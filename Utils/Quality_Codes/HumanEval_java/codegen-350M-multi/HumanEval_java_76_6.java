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
        // http://www.littlenumber.com/programme/list?type=1020
        return (!(x == 1 && n % n == 0) &&!(x == 2 || x == 12 || x == 24 || x == 36 || x == 48 || x == 68 || x == 96 || n == 1)) ;
    }
}
public class Problem_07
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

}
}