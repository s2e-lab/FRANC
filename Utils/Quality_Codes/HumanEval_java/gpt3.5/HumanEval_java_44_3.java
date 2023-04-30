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
int quotient = x;

// divide the input number by base until the quotient is 0
while (quotient != 0) {
    int remainder = quotient % base; // get the remainder
    result = Integer.toString(remainder) + result; // add the remainder to the result string
    quotient = quotient / base; // update the quotient
}

// return the result string
return result;
} 

//Example usage: System.out.println(changeBase(16,2)); will output "10000"
}