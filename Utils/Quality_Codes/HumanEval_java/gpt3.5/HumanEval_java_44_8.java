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
	//start of the function 
        StringBuilder result = new StringBuilder(); //create an empty string builder to store the result
        while (x > 0) { //continue the loop until x becomes 0
            int remainder = x % base; //get the remainder of x/base
            result.append(remainder); //append the remainder to the result string builder 
            x = x / base; //update the value of x to x/base
        }
        return result.reverse().toString(); //reverse the result string builder and return it as a string
//end of the function
    }
}

//Sample Inputs and Outputs

/*
Sample Input 1: changeBase(8, 3)
Sample Output 1: "22"

Sample Input 2: changeBase(9, 3)
Sample Output 2: "100"

Sample Input 3: changeBase(234, 2)
Sample Output 3: "11101010"

Sample Input 4: changeBase(16, 2)
Sample Output 4: "10000"

Sample Input 5: changeBase(8, 2)
Sample Output 5: "1000"

Sample Input 6: changeBase(7, 2)
Sample Output 6: "111"

Sample Input 7: changeBase(2, 3)
Sample Output 7: "2"

Sample Input 8: changeBase(3, 4)
Sample Output 8: "3"

Sample Input 9: changeBase(4, 5)
Sample Output 9: "4"

Sample Input 10: changeBase(5, 6)
Sample Output 10: "5"

Sample Input 11: changeBase(6, 7)
Sample Output 11: "6"

Sample Input 12: changeBase(7, 8)
Sample Output 12: "7"
*/