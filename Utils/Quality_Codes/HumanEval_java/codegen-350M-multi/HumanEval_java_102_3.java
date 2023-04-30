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
        long n = Integer.min(x, y);
        int r;

        if (x-y == 0)
            return n;
        else if (x == y)
            return n;

        int min = Integer.MAX_VALUE;
        r = 0;

        for (; x >= 0; x--) {
            if ((x % 2 == 0 && n < min))
                min = n;
            n = (r<<1)+1;
        }

        return (int)min;
    }

}