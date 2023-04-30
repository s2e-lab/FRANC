import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class ChooseNum {
    /**
     * This function takes two positive numbers x and y and returns the
     * biggest even integer number that is in the range [x, y] inclusive. If 
     * there's no such number, then the function should return -1.

     * For example:
     * choose_num(12, 15) = 14
     * choose_num(13, 12) = -1
     *
     * > chooseNum(12, 15)
     * 14
     * > chooseNum(13, 12)
     * -1
     * > chooseNum(33, 12354)
     * 12354
     * > chooseNum(5234, 5233)
     * -1
     * > chooseNum(6, 29)
     * 28
     * > chooseNum(27, 10)
     * -1
     * > chooseNum(7, 7)
     * -1
     * > chooseNum(546, 546)
     * 546
     */
    public static int chooseNum(int x, int y) {
        if( x < 0 || y < 0)
            return -1;
        if( x == y)
            return y;
        else
            return chooseNum(x, y-1) + chooseNum(x, y+1);
    }

    /**
     * <p>
     * The method in this case uses some simple rules to find the smallest value of the binary
     * number <code>b</code> in range [0, n–1] and outputs the largest as the least number.
     * </p>
     */
}