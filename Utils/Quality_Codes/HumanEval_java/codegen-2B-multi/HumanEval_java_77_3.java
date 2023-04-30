import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Iscube {
    /**
     * * Write a function that takes an integer a and returns True 
     * if this ingeger is a cube of some integer number.
     * Note: you may assume the input is always valid.
     * Examples:
     * iscube(1) ==> True
     * iscube(2) ==> False
     * iscube(-1) ==> True
     * iscube(64) ==> True
     * iscube(0) ==> True
     * iscube(180) ==> False
     *
     * > iscube(1)
     * true
     * > iscube(2)
     * false
     * > iscube(-1)
     * true
     * > iscube(64)
     * true
     * > iscube(180)
     * false
     * > iscube(1000)
     * true
     * > iscube(0)
     * true
     * > iscube(1729)
     * false
     */
    public static Boolean iscube(int a) {
        if (a < 0 || a % 4!= 0) {
            return false;
        }
        for (int d = 0; a / d > 0; d++) {
            if (a % d!= 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("0 => " + iscube(0));
        System.out.println("1 => " + iscube(1));
}
}