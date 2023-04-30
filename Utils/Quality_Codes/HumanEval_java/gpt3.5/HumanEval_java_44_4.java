import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ChangeBase {
    /**
     * Change numerical base of input number x to base.
     * return string representation after the conversion.
     * base numbers are less than 10.
     * >>> change_base(8, 3)
     * '22'
     * >>> change_base(8, 2)
     * '1000'
     * >>> change_base(7, 2)
     * '111'
     *
     * > changeBase(8, 3)
     * "22"
     * > changeBase(9, 3)
     * "100"
     * > changeBase(234, 2)
     * "11101010"
     * > changeBase(16, 2)
     * "10000"
     * > changeBase(8, 2)
     * "1000"
     * > changeBase(7, 2)
     * "111"
     * > changeBase(2, 3)
     * "2"
     * > changeBase(3, 4)
     * "3"
     * > changeBase(4, 5)
     * "4"
     * > changeBase(5, 6)
     * "5"
     * > changeBase(6, 7)
     * "6"
     * > changeBase(7, 8)
     * "7"
     */
    public static String changeBase(int x, int base) {
	String result = "";
    while (x > 0) {
        int remainder = x % base;
        result = String.valueOf(remainder) + result;
        x = x / base;
    }
    return result;
} 

/* Example usage */
public static void main(String[] args) {
    System.out.println(changeBase(8, 3)); // should print "22"
    System.out.println(changeBase(9, 3)); // should print "100"
    System.out.println(changeBase(234, 2)); // should print "11101010"
    System.out.println(changeBase(16, 2)); // should print "10000"
    System.out.println(changeBase(8, 2)); // should print "1000"
    System.out.println(changeBase(7, 2)); // should print "111"
    System.out.println(changeBase(2, 3)); // should print "2"
    System.out.println(changeBase(3, 4)); // should print "3"
    System.out.println(changeBase(4, 5)); // should print "4"
    System.out.println(changeBase(5, 6)); // should print "5"
    System.out.println(changeBase(6, 7)); // should print "6"
    System.out.println(changeBase(7, 8)); // should print "7"
}
}