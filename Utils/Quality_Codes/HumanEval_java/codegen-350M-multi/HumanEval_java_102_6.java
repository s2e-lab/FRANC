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
        int count = 1;
        int max_num = 0;
        // find an even number
        while (count < y) {
            count = count + ((y - count) % 2); 
            if (count == x) {
                // found x
                max_num = x;
                break;
            }
        }
        // find a smallest number, if possible
        return (count >= 2)? max_num + count : chooseNum(x, y / 2) + count;
    }
}
