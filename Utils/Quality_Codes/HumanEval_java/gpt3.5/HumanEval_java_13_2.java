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
	if (b == 0) {
            return a;
        } else {
            return greatestCommonDivisor(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int gcd=greatestCommonDivisor(a,b);
        System.out.printf("The Greatest Common Divisor of %d and %d is: %d",a,b,gcd);
    }
}