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
	// First, we need to determine the digits of the resulting number by dividing repeatedly by the new base
        List<Integer> digits = new ArrayList<Integer>();
        while (x > 0) {
            int remainder = x % base;
            digits.add(remainder);
            x /= base;
        }
        // then, reverse the list to get the digits in the correct order
        Collections.reverse(digits);
        // then, convert the list of digits to a string
        StringBuilder result = new StringBuilder();
        for (int digit : digits) {
            result.append(Integer.toString(digit));
        }
        return result.toString();
    }
}