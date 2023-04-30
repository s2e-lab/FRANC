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
        int ret = -1;
        if(x == 0) {
            if(y == 0) {
                return x;
            } else {
                return -1;
            }
        }
        // return x - y == 0? chooseNum(0, x, y) : chooseNum(x, y)
        while(x > y) {
            x -= x / 2;
            ret = x + ret;
            if(ret < 0) {
                ret = x + y;
            }
        }
        // x + y
}
}